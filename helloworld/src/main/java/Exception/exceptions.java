package Exception;

/**
 *
 * @author coding_java
 */
public class exceptions {
    public static void main(String[] args) {
    int integer1 = 5;
    int integer2 = 3;
        try {
      int result = integer1/(integer2 - 3);
       System.out.println(result); 
        } 
        catch(Exception e){
            System.out.println("The error is: " + e.getMessage());
            e.printStackTrace();
        }
        
    /******************** Output ************************
     The error is: / by zero
     java.lang.ArithmeticException: / by zero
	at Exception.exceptions.main(exceptions.java:17)
     ***************************************************/  
    
    }
}


