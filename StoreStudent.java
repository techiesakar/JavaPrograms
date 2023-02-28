
// Java program to input name and address of 10 students and store in "student.txt"
import java.io.*;

public class StoreStudent {
    public static void main(String[] args) {
        try {
            FileWriter myFileWriter = new FileWriter("student.txt", true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 2; i++) {
                System.out.println("Name of " + i + " student");
                String name = reader.readLine();
                System.out.println("Address of " + i + " student");

                String address = reader.readLine();

                myFileWriter.write(name + " " + address + " \n");
            }
            myFileWriter.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
