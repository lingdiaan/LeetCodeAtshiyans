package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",8080);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

    }
}
