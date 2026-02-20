import java.io.FileWriter;
import java.io.IOException;

public class UpdateFileContent {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("sample2.txt")) {
            writer.write("Updated content");
            System.out.println("File updated successfully.");
        } 
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}