import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.locks.Lock;

public class ProduceConsumer {

    public static void main(String[] args) {
        Queue<Integer> sharedQue = new LinkedList<>();
        Producer p = new Producer(sharedQue);
        Consumer c = new Consumer(sharedQue);
        p.start();
        c.start();


    }

}
class Producer extends Thread {
    private static final int max_QUEUE_SIZE = 5;
    private final Queue sharedQUe;

    Producer(Queue sharedQUe) {
        this.sharedQUe = sharedQUe;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (sharedQUe) {
                while (sharedQUe.size() > max_QUEUE_SIZE) {
                    System.out.println("队列已满");
                    try {
                        sharedQUe.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sharedQUe.add(i);
                System.out.println("创建了" + i);
                sharedQUe.notify();
            }
        }
    }
}


class Consumer extends Thread {
    private final Queue sharedQUe;

    Consumer(Queue sharedQUe) {
        this.sharedQUe = sharedQUe;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQUe) {
                while (sharedQUe.size() == 0) {
                    System.out.println("队列已空");
                    try {
                        sharedQUe.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = (int) sharedQUe.poll();
                System.out.println("消费了第" + num + "个");
                sharedQUe.notify();
            }
        }
    }
}
