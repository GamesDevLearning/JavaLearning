package inferfacesimplement;

/** @author coding_java **/

public class Phrase {
    public static void main(String[] args) {
        //new instances of interfaces
        InterfaceImpl s = new InterfaceImpl();
        s.function();
        NewImpl n = new NewImpl();
        n.function();
    }
    
}

/******* OUTPUT *******************
 Writing a sentence.
 Creating and adding a new sentence.
 *********************************/













