package socket.TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.ClassNotFoundException;

/**
 *
 * @author willi
 */
public class ServidorTCP {

    private static ServerSocket server;
    private static int port = 5000;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Socket socket = new Socket();
        server = new ServerSocket(port);
        while (true) {
            System.out.println("Servidor en linea");
            Socket socket = server.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Finish Request " + message);
            socket.close();
            server.close();

        }
    }
}
