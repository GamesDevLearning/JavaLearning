package Abstract;

/** @author coding_java **/
abstract class Bird {
    String name;
    public void tweet(){
        this.name="Robin";
        System.out.print(this.name + " " +"tweet!");

    }
 
}

class Robin extends Bird {
}

public class AbstractLearning {
    public static void main(String[] args) {
        Robin b = new Robin();
        b.tweet();
        
    }
    
}

/******* Output *******
 Robin tweet!
 *********************/


