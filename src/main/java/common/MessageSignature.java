package common;

import java.util.Arrays;

/**
 * Created by leo on 12/1/14.
 */
public class MessageSignature {

    private final byte[] bytes;

    public MessageSignature(byte[] bytes){
        this.bytes = bytes;
    }

    public byte[] getBytes() {
        return bytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageSignature that = (MessageSignature) o;

        if (!Arrays.equals(bytes, that.bytes)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return bytes != null ? Arrays.hashCode(bytes) : 0;
    }
}
