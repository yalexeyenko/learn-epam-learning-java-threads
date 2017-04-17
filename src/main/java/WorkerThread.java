/**
 * Created by alexeyenko on 16.04.2017.
 */
public class WorkerThread extends Thread {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        workToBeDone();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void workToBeDone() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}