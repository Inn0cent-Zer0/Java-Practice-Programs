import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerSocketTest {
    public static void main(String[] args) {
        try {
            int port = Integer.parseInt(args[0]);
            Random random = new Random();
            ServerSocket ss = new ServerSocket(port);
            while (true) {
                Socket s = ss.accept();
                OutputStream os = s.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os);
                dos.writeInt(random.nextInt());
                s.close();
            }
            catch(Exception e)
            {
                System.out.println("Exception :" + e);
            }
        }
    }
}