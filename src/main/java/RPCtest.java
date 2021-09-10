import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

@Controller
public class RPCtest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        RPCtest r = new RPCtest();
        Class c = r.getClass();
        Class d = Class.forName("RPCtest");
        System.out.println(c==d);
        System.out.println(c.getInterfaces());


    }
}
