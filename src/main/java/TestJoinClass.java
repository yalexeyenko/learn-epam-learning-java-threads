/**
 * Created by alexeyenko on 16.04.2017.
 */
public class TestJoinClass extends Thread {

    public TestJoinClass(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ", i = " + i);
        }
    }

}
