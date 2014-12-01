package common;

/**
 * Created by andrew on 11/27/14.
 */
public class Transaction<T> {
    private Viewstamp id;
    private final int targetIndex;
    private final T value;
    private boolean committed;
    private Object viewstamp;

    public Transaction(Viewstamp id, int targetIndex, T value) {
        this.id = id;
        this.targetIndex = targetIndex;
        this.value = value;
        this.committed = false;
    }

    public void commit() {
        committed = true;
    }

    public Viewstamp getId() {
        return id;
    }
}
