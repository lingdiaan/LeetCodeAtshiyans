package JUC;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);//固定线程池大小
        ExecutorService service1=Executors.newSingleThreadExecutor();//单个线程池
        ExecutorService service2=Executors.newCachedThreadPool();//可伸缩大小

        for (int i = 0; i < 50; i++) {
service2.execute(new Runnable() {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
});
        }
        service.shutdown();
    }
}
