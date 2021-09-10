package JUC;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        new BlockQueueTest().test3();
    }
    //抛出异常
    public void test1(){
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(2);
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("b"));
//        System.out.println(blockingQueue.add("c"));
        System.out.println(blockingQueue.remove());

    }

    public void test2(){
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(2);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));
    }

    public void test3() throws InterruptedException {
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(2);
       blockingQueue.put("a");
        blockingQueue.put("b");
        blockingQueue.put("c");
        System.out.println("ok");
    }
}
