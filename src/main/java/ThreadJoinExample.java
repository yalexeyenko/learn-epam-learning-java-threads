/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1 = new TestJoinClass("Thread 1");
        Thread t2 = new TestJoinClass("Thread 2");
        Thread t3 = new TestJoinClass("Thread 3");

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
    }

}
