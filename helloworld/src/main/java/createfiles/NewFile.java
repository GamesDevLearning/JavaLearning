package createfiles;
import java.io.File;
import java.io.IOException;

/**
 * @author coding_java
 */

public class NewFile {
    public static void main(String[] args) {
        File new1 = new File("demo.txt");
        boolean result;
        try {
            result = new1.createNewFile();
            if (result) {
                System.out.println("File created");
            }
            else 
                System.out.println("File already exists");
        } catch (IOException e) {
        }
    }
}






