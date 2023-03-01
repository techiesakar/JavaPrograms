import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("student.txt");
            Scanner sc = new Scanner(myFile);
            if (sc.hasNextLine()) {
                String myline = sc.nextLine();
                System.out.println(myline);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error Occured");

        }
    }
}
