import java.io.DataOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket S = new Socket("localhost", 6666);
            DataOutputStream dOut = new DataOutputStream(S.getOutputStream());
            dOut.writeUTF("Hello Server");
            dOut.flush();
            S.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
