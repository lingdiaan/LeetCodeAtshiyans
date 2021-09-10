package JUC;

import java.util.concurrent.CountDownLatch;

public class CountTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch c= new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            new Thread(()->{c.countDown();}).start();
        }
        c.await();

        System.out.println(c.getCount());
    }
}
