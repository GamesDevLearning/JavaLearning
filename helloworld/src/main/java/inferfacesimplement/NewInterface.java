package inferfacesimplement;
/* @author coding_java  */

//Interface 
public interface NewInterface {
    //Methods 
    public String sayhello = "Writing a sentence.";
    public String sayhello2 = "Creating and";
}
interface SecondInterface {
    public String newString = "adding a new sentence.";
}
/* Class that implements interfaces */
class InterfaceImpl implements NewInterface {
    public void function(){
        System.out.println(NewInterface.sayhello);
    }
} 
/* Class that implements more than one interface */
  class NewImpl implements NewInterface, SecondInterface {
    public void function(){
        System.out.println(NewInterface.sayhello2 + " "+
                SecondInterface.newString);
    }  
}





