package JUC;

import java.util.concurrent.TimeUnit;

public class MyLockTest {
    public static void main(String[] args) throws InterruptedException {
        MyLock lock = new MyLock();
        new Thread(()->{
            lock.addLock();
            try{
                TimeUnit.SECONDS.sleep(3);
            }catch (Exception e){}finally {
                lock.unLock();
            }
        },"t1").start();

        TimeUnit.SECONDS.sleep(1);
        new Thread(()->{
            lock.addLock();
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){}finally {
                lock.unLock();
            }
        },"t2").start();

    }
}
