/**
 * Created by alexeyenko on 15.04.2017.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " a thread created by implementing Runnable interface");
    }
}
