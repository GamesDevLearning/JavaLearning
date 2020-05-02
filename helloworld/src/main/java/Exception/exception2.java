package Exception;
/**
 *
 * @author coding_java
 */
public class exception2 {
    public static void main(String[] args) {
        int[] array = {1, 2};
    
        try { 

        System.out.println(array[3]);
        }
        catch(Exception e){
            System.out.println("The error is: " + e.getMessage());
            e.printStackTrace();
        }
        
    }
    
    /***************************************************************************
    The error is: Index 3 out of bounds for length 2
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
	at Exception.exception2.main(exception2.java:14)
    ***************************************************************************/
}




