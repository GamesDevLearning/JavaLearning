package SwitchStatement;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author coding_java
 */
public class Switch {
    public static void main(String[] args) {
        System.out.println("Are you happy?");
        Scanner scanner = new Scanner(System.in);
        String mood = scanner.nextLine();
        switch (mood){
            case "Yes":
                System.out.println("Great");
                break;
            case "No":
                System.err.println("Sorry to hear");
                break;
            case "Kinda":
                System.out.println("Ok");
            default:
                System.out.println("I don't understand");
                break;
        }
    }
}
