import java.io.*;

    class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AllExceptionTypes {

    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt"); // may cause IOException
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
        br.close();
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int result = a / b;   
            System.out.println(result);

            int[] arr = new int[3];
            arr[5] = 100;

            readFile();

            checkAge(15);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        }
        catch (IOException e) {
            System.out.println("File Handling Exception");
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }

        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues normally...");
    }
}