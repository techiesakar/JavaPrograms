public class newMultiThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("The ID of this thread is " + Thread.currentThread().threadId());
        };

        Thread myObj1 = new Thread(runnable);
        Thread myObj2 = new Thread(runnable);
        myObj1.start();
        myObj2.start();
    }
}
