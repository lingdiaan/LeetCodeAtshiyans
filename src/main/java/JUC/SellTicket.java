package JUC;
//实现解耦
public class SellTicket {
    //并发，资源类丢入线程
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
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

class Ticket{
    //属性，方法
    private int number = 50;
    //方法
    public synchronized void sale(){
        if(number>0)
            System.out.println(Thread.currentThread().getName()+"卖出了第"+number--+",剩余"+number);
    }

}
