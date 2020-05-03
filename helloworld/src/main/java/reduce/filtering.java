package reduce;
import java.util.Arrays;
import java.util.List;

/** @author coding_java **/
public class filtering {
        public static void main(String[] args) {
          
        List<String> languages = Arrays.asList(
         "Python", "Java", "JavaScript", "C", "Go", "Scala", "Bash"
        );    
        //Stream
        languages.stream()       
                .filter(o -> o.contains("J"))
                .filter(o -> o.endsWith("a"))
                .forEach(System.out::println);
    }
    
}
        
/*************** Output *******************
                  Java
******************************************/



