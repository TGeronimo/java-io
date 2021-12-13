import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            readInputWriteToFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Can't write to file.");
        }
    }

    public static void readInputWriteToFile() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("List 3 movies and type \"end\" when done: ");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File f = new File("movies-recommendation.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = sc.nextLine();
        } while (!line.equalsIgnoreCase("end"));

        pw.printf("File \"%s\" foi criado com sucesso.", f.getName());
        pw.close();
        sc.close();
        bw.close();
    }
}
