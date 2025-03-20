package Filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        try {
            // Create folder if it doesn't exist
            File directory = new File("/home/neo/Desktop/git/JAVA/Filehandling");
            if (!directory.exists()) {
                directory.mkdirs(); // Create folder
            }

            // Write to the file
            FileWriter writer = new FileWriter("/home/neo/Desktop/git/JAVA/Filehandling/myfile.txt");
            writer.write("Files in Java are seriously good");
            writer.close();

            System.out.println("Successfully written.");
        } catch (IOException e) {
            System.out.println("An error has occurred: " + e.getMessage());
            e.printStackTrace(); // Print detailed error
        }
    }
}
