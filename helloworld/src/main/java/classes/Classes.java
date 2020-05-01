package classes;
/** @author coding_java */
public class Classes {
    //Fields: Store object state
    int people;
    int seats;
   
    //Contructor: This sets the inital state
    Classes(){
        seats = 100;
        people = 0;
    }

    //Method(s): performs operations
    void addonePerson(){
        if(people < seats)
            people += 1;
    }   

    public static void main(String[] args) {
          //Declare new varibale to use class 
            Classes concert1 = new Classes();
            //calling method on concert 1
            concert1.addonePerson();
            System.out.println(concert1.people);
    }
}
/* Output = 1 */
