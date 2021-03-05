package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Before File read");

        try {
            FileInputStream fp = new FileInputStream("D:\\javaclass\\cucumbernotes.txt");
        }
        catch ( Exception e)
        {
            System.out.println("inside catch ");
        }
        System.out.println("File read sucessfully");

        System.out.println("End of the program");

    }
}
