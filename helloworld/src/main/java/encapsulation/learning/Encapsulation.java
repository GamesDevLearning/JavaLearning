package encapsulation.learning;

/**
 @author coding_java
 */
public class Encapsulation {
     private String IdNum;
     private int age;
     
     public void setID(String newID){
        IdNum = newID;
     }
    public String getID(){
        return IdNum;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }
}
