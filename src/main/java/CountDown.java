/**
 * Created by alexeyenko on 16.04.2017.
 */
public class CountDown {
    public void printCount() {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println("--- " + i);
            }
            System.out.println("Blastoff!");
        } catch (Exception e) {
            System.out.println("Thread interrupted!");
        }
    }
}
