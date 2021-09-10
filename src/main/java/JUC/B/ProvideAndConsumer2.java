package JUC.B;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProvideAndConsumer2 {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(()->{
            try {
                for(int i=0;i<10;i++)data.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                for(int i=0;i<10;i++)data.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();new Thread(()->{
            try {
                for(int i=0;i<10;i++)data.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();
        new Thread(()->{
            try {
                for(int i=0;i<10;i++)data.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"D").start();
    }
}

//资源类
class Data {
    private int number = 0;
    //+1
    Lock r = new ReentrantLock();
    Condition condition = r.newCondition();

    public void increment() throws InterruptedException {
        r.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "==>" + number);
            condition.signalAll();
        } catch (Exception e) {
            throw e;
        } finally {
            r.unlock();
        }

    }

    //-1
    public void decrement() throws InterruptedException {
        r.lock();
        try {
            while (number == 0) {
                condition.await();


            }
            number--;
            System.out.println(Thread.currentThread().getName() + "==>" + number);
            condition.signalAll();
        } catch (Exception e) {
            throw e;
        } finally {
            r.unlock();
        }
    }
}
