/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadRunner {

    public static void main(String[] args) {
        IdGenerator id = new IdGenerator();
        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + " , ID value: " + id.getCounter());
        };

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r1, "Thread 2");

        t1.start();
        t2.start();
    }

}
