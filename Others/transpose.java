
// Transpose of Matrix
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int[][] myMatrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Element: " + "a" + i + j);
                myMatrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myMatrix[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("The Transpose is");

        // Transpose

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myMatrix[j][i] + "\t");
            }
            System.out.print("\n");
        }
    }
}
