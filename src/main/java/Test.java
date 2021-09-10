import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.*;

public class Test {
    private volatile static int i=0;
    public static void main(String[] args)  {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,100,(long)200, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>(10),new ThreadPoolExecutor.CallerRunsPolicy());
        System.out.println(threadPoolExecutor.getCorePoolSize());
        for ( i = 0; ; i++) {
            threadPoolExecutor.execute(new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("这位大哥叫"+Thread.currentThread().getName()+"===="+i);
//                    if(i==100)
//                    System.out.println(threadPoolExecutor.shutdownNow());
                    System.out.println("========================================================");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }));
        }



    }

}
