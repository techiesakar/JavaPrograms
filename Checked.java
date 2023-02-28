import java.io.*;
import java.util.*;

public class Checked {
    public static void main(String[] args) {
        try {
            File myFile = new File("aa.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }

    }
}