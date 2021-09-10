package JUC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class CASTest {
    public static void main(String[] args) {
//        AtomicInteger a = new AtomicInteger(2020);

        AtomicStampedReference<Integer> a = new AtomicStampedReference<Integer>(2,1);
        new Thread(()->{
            int stamp = a.getStamp();
            System.out.println("a=>1"+stamp);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a.compareAndSet(2, 3, a.getStamp(), a.getStamp() + 1));
            System.out.println("a=>2"+a.getStamp()+"==>");
            System.out.println(a.compareAndSet(3, 2, a.getStamp(), a.getStamp() + 1));
            System.out.println("a=>3"+a.getStamp());
        },"a").start();

        new Thread(()->{},"b").start();
        int stamp = a.getStamp();
        System.out.println("b=>1"+stamp);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.compareAndSet(2, 5, stamp, stamp + 1));
        System.out.println("b=>2"+a.getStamp());
    }
}
