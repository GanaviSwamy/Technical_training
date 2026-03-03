import java.io.*;

public class ExceptionTypesDemo {
    public static void main(String[] args) {

        // Unchecked Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Exception
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}