package gameengine.operations;

import PBFT.Operation;
import gameengine.ChineseCheckersState;

/**
 * Created by sctu on 11/30/14.
 */
public class NoOp implements ChineseCheckersOperation {
    @Override
    public void apply(ChineseCheckersState state) {

    }

    @Override
    public boolean isValid(ChineseCheckersState state) {
        return false;
    }

    @Override
    public void undo(ChineseCheckersState state) {

    }

    @Override
    public Operation serialize() {
        return null;
    }
}
