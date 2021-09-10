import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTest {
    public static void main(String[] args) {
        Lock l = new ReentrantLock();
        Condition condition = l.newCondition();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LockSupport.park();
//           l.lock();
                System.out.println("输出");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
LockSupport.unpark(Thread.currentThread());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                l.lock();
                System.out.println("接着输出");
            }
        }).start();
    }
}
