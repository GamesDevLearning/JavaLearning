package whileloop;

/**
 * @author coding_java
 */
public class While {
    public static void main(String[] args) {
       
   int value = 5; 
   int result = 2;
   
   while (value > 2){   
       result *= value; 
       value -= 2; 
   }
        System.out.println(result);
    }
}






