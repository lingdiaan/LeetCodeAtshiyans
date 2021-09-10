import com.sun.net.httpserver.HttpServer;
import org.springframework.web.servlet.HttpServletBean;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
    private static volatile int i;
    public static void main(String[] args) {

        ThreadPoolExecutor th = new ThreadPoolExecutor(5,10,(long)5, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<>(), new ThreadPoolExecutor.DiscardPolicy());
        for(i=0;i<100;i++){
            th.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }


    }
}
