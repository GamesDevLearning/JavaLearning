package reduce;

import java.util.Arrays;


/** @author coding_java **/
public class Reduce {
    public static void main(String[] args) {

        int values[] = { 1, 2, 3, 4, 5, 6};
         //Stream
        int sum = Arrays.stream(values).sum();
        System.out.printf("The sum of values: %s", sum);
    }
    
}

/*************** Output *******************
       The sum of values: 21
******************************************/


