/**
 * Created by alexeyenko on 16.04.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        // print the information abount the current state
        System.out.printf("Thread name: %s, isAlive: %b, state: %s, priority: %d\n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive(), Thread.currentThread().getState(), Thread.currentThread().getPriority());

        // create a Runnable object that prints information about thread
        Runnable r1 = () -> {
            Thread thd = new Thread();
            System.out.printf("Thread name: %s, isAlive: %b, state: %s, priority: %d\n", thd.getName(),
                    thd.isAlive(), thd.getState(), thd.getPriority());
        };

        // create thread t1 and print the information before calling start()
        Thread t1 = new Thread(r1, "Thread t1");
        System.out.printf("Thread name: %s, isAlive: %b, state: %s, priority: %d\n", t1.getName(),
                t1.isAlive(), t1.getState(), t1.getPriority());
        t1.start();

        // create thread t2 with only Runnable object and no name
        Thread t2 = new Thread(r1);
        t2.start();

        // put main thread to sleep for 2 seconds
        Thread.sleep(2000L);

        // change the name pf thread 2 and print out its info
        t2.setName("Thread 2");
        System.out.printf("Thread name: %s, isAlive: %b, state: %s, priority: %d\n", t2.getName(),
                t2.isAlive(), t2.getState(), t2.getPriority());

        // print info about the current thread
        System.out.printf("Thread name: %s, isAlive: %b, state: %s, priority: %d\n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive(), Thread.currentThread().getState(), Thread.currentThread().getPriority());
    }
}
