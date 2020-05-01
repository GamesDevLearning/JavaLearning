package Collections;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author coding_java
 */
public class Collections {
    public static void main(String[] args) {
        Planet Venus = new Planet("Venus", "gas");
        Planet Mars = new Planet("Mars", "rock");
        Planet Earth = new Planet("Earth", "rock");
        
        Collection<Planet> planets = new ArrayList<>();
        planets.add(Venus);
        planets.add(Mars);
        planets.add(Earth);
        
        planets.forEach((planet) -> {
            System.out.println(planet);
        });
        }

    }
        
    
/* Output is 
Planet{name=Venus, type=gas}
Planet{name=Mars, type=rock}
Planet{name=Earth, type=rock}
*/
