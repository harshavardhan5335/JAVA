import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("Files in java are seriuoly good");
            Writer.close();
            System.out.println("Sucessfully writter.");
        }

        catch (IOException e) {
            System.out.println("An error has occured");
        }
    }
}