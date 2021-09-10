package JUC;

import java.util.concurrent.TimeUnit;

public class DeadLockTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("haha","xixi");
        MyThread myThread2 = new MyThread("xixi","haha");
        new Thread(myThread,"A").start();
        new Thread(myThread2,"B").start();

    }

}
class MyThread implements Runnable{
    private String lockA;
    private String lockB;

    public MyThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"=====lockA"+lockA+"want lock B====="+lockB);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB){
                System.out.println("同时获取成功");
            }

        }
    }
}
