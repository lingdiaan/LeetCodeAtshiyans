package JUC;

public class ProvideAndConsumer {
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
class Data{
private int number = 0;
//+1

    public synchronized void increment() throws InterruptedException {
        while(number!=0){

            this.wait();
        } number++;
        System.out.println(Thread.currentThread().getName()+"==>"+number);
        this .notify();
    }
    //-1
    public synchronized  void decrement() throws InterruptedException {
        while(number==0){
            this.wait();
        }number--;
        System.out.println(Thread.currentThread().getName()+"==>"+number);
        this.notify();
    }
}
