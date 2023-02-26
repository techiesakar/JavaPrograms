import java.io.*; // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Checked {
    public static void main(String[] args) {
        try {
            File myObj = new File("aa.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            // e.printStackTrace();
        }
    }
}