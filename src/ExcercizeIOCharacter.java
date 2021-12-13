import java.io.*;

public class ExcercizeIOCharacter {
    public static void main(String[] args) throws IOException {
        readInputPrintOutput();
    }

    public static void readInputPrintOutput() throws IOException {

        System.out.println("List 3 movies: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.isBlank());
        bw.flush();

        br.close();
        bw.close();
    }
}
