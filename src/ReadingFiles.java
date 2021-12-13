import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

public class ReadingFiles {

    public static void copyFile() throws IOException {
        File file = new File("movies-recommendation.txt");
        String fileName = file.getName();

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        String copiedFileName = fileName.substring(0, fileName.indexOf(".")).concat("-copy.txt");

        File fileCopy = new File(copiedFileName);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (line != null);

        System.out.printf("File \"%s\" copied. %d", file.getName(), file.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("3 books recommendation: ");
        pw.flush();

        appendInfoToFile(fileCopy.getName());

        br.close();
        bw.close();
        pw.close();

    }

    private static void appendInfoToFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.equalsIgnoreCase("end"));

        br.close();
        bw.close();
    }

    public static void main(String[] args) {
        try {
            copyFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found.");
        }
    }
}
