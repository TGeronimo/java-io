package objects;

import java.io.*;

public class SerializationEx {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serialize();
        desserialize("C:\\Users\\THIAGO.GERONIMO\\Documents\\Quality\\dev\\Java\\java-io\\cat");
    }

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

    public static void desserialize(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(file));
        Cat cat = (Cat) inputStream.readObject();

        System.out.printf("Object deserialized with %d bytes:\n%s\n", file.length(), cat.toString());
    }
}
