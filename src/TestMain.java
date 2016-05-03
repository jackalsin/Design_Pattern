import java.util.ArrayList;
import java.util.List;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class TestMain {
    private volatile int volatileCounter = 0;
    private int nonVolatileCounter = 0;
    private Integer syncBlockCounter = 0;
    private int syncMethodCounter = 0;


    private List<Thread> countTask = new ArrayList<>();

    public TestMain() throws InterruptedException {
        syncBlockCounter = 0;
        for (int i = 0; i < 4; i++) {
            countTask.add(new Thread(() -> {
                for (int j = 0; j < 1_000; j++) {
                    volatileCounter++;
                    nonVolatileCounter++;
                    synchronized (syncBlockCounter) {
                        ++syncBlockCounter;
                    }
                    increament();
                }
            }));
        }
        for (Thread t : countTask) t.start();
        for (Thread t : countTask) t.join();

    }

    private synchronized void increament() {
        syncMethodCounter++;
    }
    public static void main(String[] args ) throws InterruptedException {
        TestMain testMain = new TestMain();

        System.out.println(testMain.nonVolatileCounter);
        System.out.println(testMain.volatileCounter);
        System.out.println(testMain.syncBlockCounter);
        System.out.println(testMain.syncMethodCounter);
    }

}
