import java.util.concurrent.CountDownLatch;

/**
 * Created by alexeyenko on 16.04.2017.
 */
public class Worker extends Thread {
    private final CountDownLatch start;
    private final CountDownLatch end;

    public Worker(CountDownLatch start, CountDownLatch end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            printInfo("thread entering run()");
            start.await();
            printInfo("doing work");
            Thread.sleep(3000L);
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void printInfo(String s) {
        System.out.println(System.currentTimeMillis() + ": " + Thread.currentThread() + ": " + s);
    }

}
