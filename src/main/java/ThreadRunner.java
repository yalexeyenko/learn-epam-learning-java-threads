import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadRunner {
    public static void main(String[] args) {
        // create a pool of 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i <= 10; i++) {
            Runnable worker = new WorkerThread("I'm thread " + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {}

        System.out.println("Finished all threads");
    }
}