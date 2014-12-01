package common;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

/**
 * Created by sctu on 11/30/14.
 */
public final class CryptoUtil {
    private static final ObjectMapper mapper = new ObjectMapper(); // thread-safe
    private static final String[] IGNORED_FIELD = {"messageSignature"};
    private static final FilterProvider FIELD_FILTER = new SimpleFilterProvider()
            .addFilter("pre-prepare filter",
                    SimpleBeanPropertyFilter.serializeAllExcept(IGNORED_FIELD));

    private CryptoUtil() {
        // don't instantiate
    }

    private static byte[] computeSignature(byte[] byteRep, Signature sig) {
        try {
            sig.update(byteRep);
            return sig.sign();
        } catch (SignatureException e) {
            e.printStackTrace();
            System.exit(1);
            return null;
        }
    }

    public static byte[] computeTransactionDigest(PBFT.Transaction transaction) {
        try {
            ObjectWriter writer = mapper.writer();
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest(writer.writeValueAsString(transaction).getBytes());
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static byte[] computeMessageSignature(Object message, Signature sig) {
        try {
            ObjectWriter writer = mapper.writer(FIELD_FILTER);
            return computeSignature(writer.writeValueAsString(message).getBytes(), sig);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}