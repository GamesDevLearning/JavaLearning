package Queue;
import java.util.LinkedList;
import java.util.Queue;

/** @author coding_java **/
public class techQueue {
    public static void main(String[] args) {
        Queue<String> techList = new LinkedList<>();
        techList.add("AWS");
        techList.add("Blockchain");
        techList.add("DevOps");
        techList.add("AI");
        
        techList.poll();
        System.out.println(techList);
        System.out.println(techList.contains("AWS"));
        
    }   
}

/****************** Output *********************
[Blockchain, DevOps, AI]
false
*************************************************/

