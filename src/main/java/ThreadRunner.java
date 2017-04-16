/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadRunner {
    public static void main(String[] args) {
        ThreadB tB = new ThreadB();
        tB.start();
        synchronized (tB) {
            try {
                System.out.println("waiting for tB thread to complete...");
                tB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("total: " + tB.total);
        }
    }
}
