// Multi Thread
public class MultiThread implements Runnable {
    public void run() {
        System.out.println("The ID of this thread is " + Thread.currentThread().threadId());
    }

    public static void main(String[] args) {
        Thread myObj1 = new Thread(new MultiThread());
        Thread myObj2 = new Thread(new MultiThread());
        myObj1.start();
        myObj2.start();
    }
}
