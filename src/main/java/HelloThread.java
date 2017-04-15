/**
 * Created by alexeyenko on 15.04.2017.
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName() + " a thread created by extending Thread class");
    }

}
