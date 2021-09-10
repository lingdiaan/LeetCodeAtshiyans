package JUC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTest {
    public static void main(String[] args) {
        Ph p = new Ph();
        new Thread(()->{
            p.sms();
        },"A").start();
        new Thread(()->{
            p.sms();
        },"B").start();

    }
}

class Phone{
    public synchronized void sms() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"sms");

        call();
    }

    public synchronized void call() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"call");
        TimeUnit.SECONDS.sleep(2);
    }
}

class Ph{
    Lock r = new ReentrantLock();
    public void sms(){
        r.lock();
        r.lock();
        System.out.println(Thread.currentThread().getName()+"sms");

        call();
        r.unlock();
    }

    public void call(){
        r.lock();
        System.out.println(Thread.currentThread().getName()+"call");
        r.unlock();
        r.unlock();
    }
}
