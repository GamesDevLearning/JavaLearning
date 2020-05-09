package createfiles;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/** @author coding_java **/
public class FileStream {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("File name: ");
            String name = s.nextLine();
            try (FileOutputStream f = new FileOutputStream(name, true)) {
                System.out.println("Enter content: ");
                String s1;
                s1 = s.nextLine()+"\n";
                byte[] b = s1.getBytes();
                f.write(b);
                f.close();
            }
        } catch (IOException e) {
        }
    }
    
}

