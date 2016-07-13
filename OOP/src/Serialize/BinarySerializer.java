package Serialize;

import java.io.*;

public class BinarySerializer extends Serializer implements Serializable{

    private static BinarySerializer instance;

    private BinarySerializer() {}

    public static BinarySerializer getInstance() {
        if (instance == null) {
                instance = new BinarySerializer();
        }
        return instance;
    }

    @Override
    public void serialize(Object o, OutputStream outputStream) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(o);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object deserialize(InputStream inputStream) {
        Object o = null;
        try {
            ObjectInputStream objectInputStream = null;
            objectInputStream = new ObjectInputStream(inputStream);
            o = objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }
}
