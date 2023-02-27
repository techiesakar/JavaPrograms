// Multi Thread
public class MultiThread implements Runnable {
    public void run() {
        System.out.println("The ID of this thread is " + Thread.currentThread().threadId());
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            Thread myObj = new Thread(new MultiThread());
            myObj.start();
        }

    }
}