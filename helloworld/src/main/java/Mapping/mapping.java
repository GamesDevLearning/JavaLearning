package Mapping;
import java.util.HashMap;
import java.util.Map;
/*********************
 * @author coding_java
 *********************/
public class mapping {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("clock", 50);
        items.put("TV", 600);
        

        System.out.println("The value is: " + items.get("clock") + 
        " Is the key 50 present? " + items.containsValue(50));      
        System.out.println("Is the key TV present? " +  
        items.containsKey(50)); 
        System.out.println("The map size is " + items.size()); 
        System.out.println("Is this map empty? " + items.isEmpty()); 
        
    }  
}
/***************** Output ********************* 
The value is: 50 Is the key 50 present? true
Is the key TV present? false
The map size is 2
Is this map empty? false
***********************************************/

