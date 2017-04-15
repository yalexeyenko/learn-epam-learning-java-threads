import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexeyenko on 15.04.2017.
 */
public class CreateThreadTest {

    @Test
    public void shouldCreateAndRunAThreadUsingClassImplementingRunnable() {
        Thread t1 = new Thread(new HelloRunnable());
        Assert.assertNotNull(t1);
        t1.start();
    }

    @Test
    public void shouldCreateAndRunAThreadUsingClassExtendingThread() {
        Thread t2 = new HelloThread();
        Assert.assertNotNull(t2);
        t2.start();
    }

    @Test
    public void shouldCreateAndRunAThreadUsingAnonymousClassImplementingRunnable() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName() + " not using Lambda notation");
            }
        };
        Thread t3 = new Thread(r1, "Thread t1");
        Assert.assertNotNull(t3);
        t3.start();
    }

    @Test
    public void shouldCreateAndRunAThreadUsingAnonymousClassImplementingRunnableUsingLambdaNotation() {
        Runnable r2 = () ->
                System.out.println("Hello from " + Thread.currentThread().getName() + " using Lambda notation");
        Thread t4 = new Thread(r2);
        Assert.assertNotNull(t4);
        t4.start();
    }
}
