import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String inputFile = "a.txt";
        String outputFile = "b.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line from input file
            }
            System.out.println("Content from " + inputFile + " copied to " + outputFile + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
