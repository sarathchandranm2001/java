import java.io.*;

public class FileMerge {

    public static void main(String[] args) {
        mergeFiles("file1.txt", "file2.txt", "mergedFile.txt");
    }

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            // Read and write data from the first file
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Read and write data from the second file
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files merged successfully!");

            // Close all resources
            reader1.close();
            reader2.close();
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred while merging files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
