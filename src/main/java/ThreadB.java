/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadB extends Thread {
    public int total;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}
