import java.util.concurrent.CountDownLatch;

/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadRunner {
    public static void main(String[] args) {
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(4);

        for (int i = 0; i < 10; i++) {
            new Thread(new Worker(start, end)).start();
        }

        try {
            System.out.println("main thread doing something");
            Thread.sleep(1000L);
            start.countDown(); // let all threads proceed (each one waits for start to countdown from 1 to 0 and then proceed)
            System.out.println("main thread doing something else");
            end.await(); // wait for all threads to finish. Each thread countdowns (4 - 3 - 2 - 1) and then main proceeds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
