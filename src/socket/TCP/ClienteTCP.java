
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
//import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author willi
 */
public class ClienteTCP {

    static String host = "127.0.0.1";
    private static int port = 5000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        while (true) {
            System.out.println("Iniciando socket para comunicación");
            Socket socket = new Socket(host, port);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("My first try");
            oos.close();
            socket.close();
        }
    }

}
