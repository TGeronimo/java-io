package objects;

import java.io.*;

public class SerializationEx {
    public static void serialize() throws IOException {

        Cat cat = new Cat("Brisa",2, "white");
        File fileToSerialize = new File("cat");

        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(fileToSerialize.getName()));

        // serialization
        outputStream.writeObject(cat);
        System.out.printf("Object serialized with %d bytes:\n%s\n", fileToSerialize.length(), cat.toString());

        outputStream.close();

    }

    public static void desserialize(String file) {

    }

    public static void main(String[] args) throws IOException {
        serialize();

    }
}
