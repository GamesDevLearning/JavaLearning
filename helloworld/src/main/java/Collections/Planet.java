
package Collections;

/**
 *
 * @author coding_java
 */
public class Planet {
    private final String name;
    private final String type;
    public Planet(String name, String type)
    {
            this.name = name;
            this.type = type;
    }
    public String getName(){return name;}
    public String getType(){return type;}
    
    @Override
    public String toString()
    {
        return "Planet{" +
                "name=" + name + 
                ", type=" + type +
                '}';
    }
        
    
}
