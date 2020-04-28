
package Hello;

/**
 *
 * @author coding_java
 */
public class Arrays {
    public static void main(String[] args) {
        //Declare an array of values
        int[] Arr = {2,3,4,5};
        int sum = 0;
        //Write for-each loop here
        for(int currentVal : Arr)
        //Sum each value of currentVal
            sum += currentVal;
        //Print out sum
        System.out.println(sum);
    }
    /*************************
     Output is 14 :)
     *************************/
    
}
