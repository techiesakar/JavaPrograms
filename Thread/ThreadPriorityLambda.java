// Setting up Thread Priority
public class ThreadPriorityLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("We are inside run");
        };
        Thread TH1 = new Thread(runnable);
        System.out.println("The priority of TH1 is : " + TH1.getPriority());
        TH1.setPriority(10);
        System.out.println("The priority of TH1 is : " + TH1.getPriority());
    }
}