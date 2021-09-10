package JUC.C;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProvideAndConsumer3 {
    public static void main(String[] args) {
        Data2 data = new Data2();
        new Thread(()->{
            try {
                for(int i=0;i<110;i++) data.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        new Thread(()->{for(int i=0;i<10;i++)data.printB();},"B").start();
        new Thread(()->{for(int i=0;i<10;i++)data.printC();},"C").start();

    }
}

//资源类
class Data2 {
    private int number = 1;
    //+1
    Lock lock = new ReentrantLock();
    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();

    public void printA() throws InterruptedException {
        lock.lock();
        try{
            while(number!=1){
                conditionA.await();
            }
            System.out.println(Thread.currentThread().getName()+"===>"+number+"AAAAA");
            number=2;
            conditionB.signal();

        }catch (Exception e){
            throw e;
        }finally {
            lock.unlock();
        }

    }
    public void printB(){
        lock.lock();
        try{
            while(number!=2){
                conditionB.await();
            }
            System.out.println(Thread.currentThread().getName()+"===>"+number+"BBBBB");
            number=3;
            conditionC.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try{
            while(number!=3){
                conditionC.await();
            }
            System.out.println(Thread.currentThread().getName()+"===>"+number+"CCCCC");
            number=1;
            conditionA.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }


}
