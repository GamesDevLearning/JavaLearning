package Threading;

/* @author coding_java */

public class SequenceMain {
    public static void main(String[] args) {
        Sequence runnable1 = new Sequence(1);
        Sequence runnable2 = new Sequence(0);
        Thread t1 = new Thread(runnable1, "Thread1 ");
        Thread t2 = new Thread(runnable2, "Thread2 ");
        t1.start();
        t2.start();
    }   
}

/*** OUTPUT ****
    Thread1 1
    Thread2 2
    Thread1 3
    Thread2 4
    Thread1 5
 **************/







