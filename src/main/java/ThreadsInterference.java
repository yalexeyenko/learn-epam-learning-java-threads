/**
 * Created by alexeyenko on 16.04.2017.
 */
public class ThreadsInterference {
    public static double a = 10;
    public static double b;

    public static void main(String[] args) {
        Runnable r1 = () -> {
            if (a == 10) {
                try {
                    Thread.sleep(500L);
                    b = a / 2.0;
                    System.out.println(Thread.currentThread().getName() + ": " + b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable r2 = () -> {
            a = 12;
        };

        Thread tA = new Thread(r1, "Thread A");
        Thread tB = new Thread(r2, "Thread B");

        tA.start();
        tB.start();
    }

}
