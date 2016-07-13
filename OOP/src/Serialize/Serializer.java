package Serialize;

import java.io.InputStream;
import java.io.OutputStream;
/**
 *
 * @author PC
 */
abstract public class Serializer {
    public abstract void serialize(Object obj, OutputStream outputStream);
    public abstract Object deserialize(InputStream inputStream);
}
