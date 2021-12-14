package bytes;

import java.io.*;

public class TransferBytes {

    public static void copyFile() throws IOException {
        // copy from source
        File file = new File("/home/thiagomg/projects/java/java-io/movies-recommendation-copy.txt");
        String fileName = file.getName();

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(file.getName()));

        // output file
        String copiedFileName = fileName
                .substring(0, fileName.indexOf("-"))
                .concat("-copy2.txt");
        File fileCopy = new File(copiedFileName);

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(copiedFileName));

        int line;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        // shows the copy operation results
        PrintStream printStream = new PrintStream(System.out);
        printStream.printf("File copied: %s.\nSize: %d bytes.",
                fileCopy.getAbsolutePath(), fileCopy.length());
    }

    public static void main(String[] args) throws IOException {
        copyFile();
    }
}
