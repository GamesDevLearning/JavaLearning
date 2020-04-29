
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
        
        final Iterator<Planet> planetIterator = planets.iterator();
        while (planetIterator.hasNext())
        {
            Planet planet = planetIterator.next();
            System.err.println(planet);
        }
       
    }
    
}
/* Output is 
Planet{name=Venus, type=gas}
Planet{name=Mars, type=rock}
Planet{name=Earth, type=rock}
*/
