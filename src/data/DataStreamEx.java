package data;

import java.io.*;
import java.util.Scanner;

public class DataStreamEx {

    static File file = new File("/home/thiagomg/projects/java/java-io/src/data/clothes.bin");

    public static void addProduct() throws IOException {

        // print to console
        PrintStream printStream = new PrintStream(System.out);
        printStream.flush();

        DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream(file.getPath()));

        Scanner scanner = new Scanner(System.in);

        // asking for order information
        printStream.print("Item of cloth: ");
        String itemOfCloth = scanner.nextLine();
        dataOutputStream.writeUTF(itemOfCloth);

        printStream.print("Size of item (S/M/L/XL): ");
        char itemClothSize = (char) System.in.read();
        dataOutputStream.writeChar(itemClothSize);

        printStream.print("Quantity of item: ");
        int itemClothQuantity = scanner.nextInt();
        dataOutputStream.writeInt(itemClothQuantity);

        printStream.print("Cost of item: ");
        double itemClothCost = scanner.nextDouble();
        dataOutputStream.writeDouble(itemClothCost);

        dataOutputStream.close();
        scanner.close();
        printStream.close();

    }

    public static void getProduct(String fileToRead) throws IOException {

        // receives data from file
        String nameCloth;
        char sizeCloth;
        int quantityCloth;
        double costCloth;

        DataInputStream dataInputStream = new DataInputStream(
                new FileInputStream(file.getPath()));

        nameCloth = dataInputStream.readUTF();
        sizeCloth = dataInputStream.readChar();
        quantityCloth = dataInputStream.readInt();
        costCloth = dataInputStream.readDouble();

        System.out.printf("\nItem of Cloth: %s", nameCloth);
        System.out.printf("\nSize: %c", sizeCloth);
        System.out.printf("\nQuantity: %d", quantityCloth);
        System.out.printf("\nCost : %.2f", costCloth);


    }

    public static void main(String[] args) throws IOException {
//        addProduct();
        getProduct(file.getPath());
    }
}
