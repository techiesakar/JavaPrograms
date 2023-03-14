import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = scanner.nextInt();
            if (num < 0) {
                throw new Exception("Number cannot be negative");
            }
            System.out.println("Number entered: " + num);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
