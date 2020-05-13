package Threading;
/** @author coding_java **/
public class Sequence implements Runnable{
    public int nums_to_5=5;
    static int number = 1;
    int remainder;
    static Object lock=new Object();

    Sequence(int remainder){
    this.remainder = remainder;
    }
    @Override@SuppressWarnings("SynchronizeOnNonFinalField")
    public void run(){
    while (number < nums_to_5){
        synchronized(lock){
            while (number % 2 !=remainder) { 
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                } 
                
            }
            System.out.println(Thread.currentThread().getName() + "" + number)
                    ; number++;
                    lock.notifyAll();
}} }     }
