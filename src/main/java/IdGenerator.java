/**
 * Created by alexeyenko on 16.04.2017.
 */
public class IdGenerator {
    public int counter;

    public synchronized int getCounter() {
        return counter++;
    }
}
