public class OperatorOverloading {
    public static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    public static double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static void main(String[] args) {
        int intX = 2;
        int intY = 3;
        double doubleX = 2.0;
        double doubleY = 3.0;
        System.out.println("The power of 2 and 3 is " + power(intX, intY));
        System.out.println("The power of 2.0 and 3 is " + power(doubleX, intY));
        System.out.println("The power of 2 and 3.0 is " + power(intX, doubleY));
        System.out.println("The power of 2.0 and 3.0 is " + power(doubleX, doubleY));
    }
}
