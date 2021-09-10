package JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket02 {
    //并发，资源类丢入线程
    public static void main(String[] args) {
        Ticket2 ticket = new Ticket2();
        //lamda表达式 ()->{代码}
        new Thread(()->{
            for (int i = 0; i < 60; i++)
                ticket.sale();},"A").start();
        new Thread(()->{            for (int i = 0; i < 60; i++)
            ticket.sale();},"B").start();
        new Thread(()->{            for (int i = 0; i < 60; i++)
            ticket.sale();},"C").start();
    }
}

class Ticket2{
    //属性，方法
    private int number = 50;
    //方法
    Lock lock = new ReentrantLock();

    public  void sale(){
        lock.lock();
        try{
            if(number>0)
            System.out.println(Thread.currentThread().getName()+"卖出了第"+number--+",剩余"+number);
        }catch (Exception e ){
            throw e;
        }finally {
            lock.unlock();
        }


    }


}
