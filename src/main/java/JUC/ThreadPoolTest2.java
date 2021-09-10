package JUC;

import lombok.SneakyThrows;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest2 {
    public static void main(String[] args) {
        int v = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                v,
                v+10,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.DiscardPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
        );

        for (int i = 0; i <50; i++) {
            final int a =i;
            threadPoolExecutor.execute(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    if(a==25) System.out.println(1/0);
                    System.out.println(Thread.currentThread().getName()+"进入了"+a);
                    TimeUnit.SECONDS.sleep(2);
                }
            });
        }
        threadPoolExecutor.shutdown();
    }
}
