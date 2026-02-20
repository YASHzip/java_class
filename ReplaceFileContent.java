import java.io.FileWriter;
import java.io.IOException;

public class ReplaceFileContent {
    public static void main(String[] args) {

        String fileName = "sample.txt";
        String newContent = "This is the new replaced content.";

        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write(newContent);
            System.out.println("File content replaced successfully.");
        } 
        catch (IOException e) {
            System.err.println("Error replacing file content: " + e.getMessage());
        }
    }
}