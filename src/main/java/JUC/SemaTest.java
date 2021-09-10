package JUC;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaTest {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                try {
                    s.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"移开车位");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    s.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
