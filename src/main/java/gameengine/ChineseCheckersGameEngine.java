package gameengine;

import PBFT.ClientMessage;
import PBFT.PBFTCohort;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import common.CryptoUtil;
import common.Transaction;
import config.GroupConfigProvider;
import config.GroupMember;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import statemachine.InvalidStateMachineOperationException;
import statemachine.Operation;

import java.nio.ByteBuffer;
import java.util.Collection;

/**
 * Created by leo on 12/3/14.
 */
public class ChineseCheckersGameEngine implements GameEngine<ChineseCheckersState> {
    Logger LOG = LogManager.getLogger(ChineseCheckersGameEngine.class);

    protected final GroupConfigProvider configProvider;
    private ChineseCheckersStateMachine stateMachine;
    private Collection<GameEngineListener<ChineseCheckersState>> listeners = Lists.newArrayList();

    public ChineseCheckersGameEngine(GroupConfigProvider<PBFTCohort.Client> configProvider){
        this.configProvider = configProvider;
        this.stateMachine = new ChineseCheckersStateMachine(ChineseCheckersState.buildGameForGroupMembers(configProvider.getGroupMembers()));
    }
    @Override
    synchronized public void notifyOnCommit(Transaction<Operation<ChineseCheckersState>> transaction) throws Exception {
        this.stateMachine.applyOperation(transaction.getValue());
        // if the above does not throw an exception, then:
        for (GameEngineListener<ChineseCheckersState> listener : listeners) {
            listener.notifyOnSuccessfulApply(transaction.getValue());
        }
    }

    @Override
    public ChineseCheckersStateMachine getStateMachine() {
        return stateMachine;
    }

    @Override
    public void addListener(GameEngineListener<ChineseCheckersState> listener) {
        Preconditions.checkNotNull(listener);
        listeners.add(listener);
    }

    @Override
    synchronized public void requestCommit(Operation<ChineseCheckersState> operation) {
        final GroupMember<PBFTCohort.Client> leader = this.configProvider.getLeader();
        GroupMember<PBFTCohort.Client> me = this.configProvider.getMe();

        final String name = configProvider.getMe().getName();

        final ClientMessage message = new ClientMessage();
        message.operation = operation.serialize();
        message.replicaId = me.getReplicaID();
        message.messageSignature = ByteBuffer.wrap(CryptoUtil.computeMessageSignature(message, me.getPrivateKey()).getBytes());

        new Thread(new Runnable() {
            @Override
            public void run() {

                PBFTCohort.Client thriftConnection = null;
                try {
                    thriftConnection = leader.getThriftConnection();
                    thriftConnection.clientMessage(message);
                } catch (Exception e) {
                    LOG.error(name);
                    e.printStackTrace();
                } finally {
                    leader.returnThriftConnection(thriftConnection);
                }

            }
        }).start();
    }

}
