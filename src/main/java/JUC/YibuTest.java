package JUC;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class YibuTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Void> c= CompletableFuture.runAsync(()->{
//            try {
//                TimeUnit.SECONDS.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+"runAsync");
//        });
//        System.out.println("11111");
//        Void unused = c.get();//阻塞 获取结果

        CompletableFuture<Integer> c = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = 1/0;
            System.out.println(Thread.currentThread().getName()+"supplyAsync");return 1024;});

        c.whenComplete((t, u) -> {
            System.out.println(t);//正常的返回结果
            System.out.println(u);
        }).exceptionally((t) -> {
            t.printStackTrace();
            return 233;//错误的返回结果
        });
        System.out.println("1111");
        System.out.println(c.get());

    }
}
