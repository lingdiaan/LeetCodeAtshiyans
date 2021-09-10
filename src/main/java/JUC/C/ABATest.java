package JUC.C;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ABATest {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(2020);
        new Thread(()->{a.compareAndSet(2020,2024);}).start();
        System.out.println(a.get());
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a.compareAndSet(2022,2020);}).start();
        System.out.println(a.get());


    }
}
