import java.io.File;
import java.nio.file.Files;

public class copyFile {
    public static void main(String[] args) {
        File src = new File("student.txt");
        File dest = new File("newStudent.txt");
        try {
            Files.copy(src.toPath(), dest.toPath());
            System.out.println("File copied successfully.");

        } catch (Exception e) {
            System.out.println("Error Occured");
        }
    }
}
