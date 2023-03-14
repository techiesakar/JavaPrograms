// Thread Sync
public class ThreadSync {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSync ts = new ThreadSync();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                ts.increment();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Count: " + ts.getCount());
    }
}
