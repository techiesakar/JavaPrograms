// Setting up Thread Priority
public class ThreadPriority implements Runnable {
    public void run() {
        System.out.println("We are inside run");
    }

    public static void main(String[] args) {
        Thread TH1 = new Thread(new ThreadPriority());
        System.out.println("The priority of TH1 is : " + TH1.getPriority());
        TH1.setPriority(10);
        System.out.println("The priority of TH1 is : " + TH1.getPriority());

    }
}