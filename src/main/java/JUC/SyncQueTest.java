package JUC;

import java.util.UUID;
import java.util.concurrent.SynchronousQueue;

public class SyncQueTest {
    private static SynchronousQueue<String > s = new SynchronousQueue<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    s.put(UUID.randomUUID().toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();


        }

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println("拿出来了"+s.poll());

            }).start();
        }


    }
}


