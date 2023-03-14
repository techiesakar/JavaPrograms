import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class newServer {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to connect...");
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();
            System.out.println("Connection Established at PORT NO : 7777");
            DataInputStream myData = new DataInputStream(s.getInputStream());
            String str = (String) myData.readUTF();
            System.out.println("My String: " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println("Error Occured");
        }
    }
}
