/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadsInterference2 {
    public static int counter = 1;

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + ", ID value: " + getId());
        };

        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r1, "Thread 2");

        t1.start();
        t2.start();
    }

    public static int getId() {
        return counter++;
    }
}
