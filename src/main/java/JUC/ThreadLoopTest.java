package JUC;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

public class ThreadLoopTest {
    private static volatile int i=0;
    public static void main(String[] args) {
//      Integer a = 127;
//      Integer b = 127;
//        System.out.println(a.intValue()==b.intValue());
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//        AtomicInteger a = new AtomicInteger(1);
//        new Thread(()->{
//            while(a.get()<100){while(a.get()%2==0){System.out.println(a+Thread.currentThread().getName());a.getAndAdd(1);} }
//        },"A").start();
//        new Thread(()->{
//            while(a.get()<100)while(a.get()%2==1) {
//                System.out.println(a+Thread.currentThread().getName());
//                a.getAndAdd(1);
//            }       },"B").start();
//        Executors.newFixedThreadPool(5);
//        PriorityQueue<Integer> q = new PriorityQueue<>(10);
//        ReentrantLock r = new ReentrantLock();
//        Condition condition = r.newCondition();
//        Condition b = r.newCondition();
//        LockSupport
//        new Read().read();
//        Hashtable<Integer,Integer> a = new Hashtable<>();
////        a.put(null,1);
//        BigDecimal bigDecimal = new BigDecimal("19.2763");
//        System.out.println(bigDecimal);
//        LinkedHashMap<Integer,Integer> map  = new LinkedHashMap<>();
//        Collections.synchronizedMap(new LinkedHashMap<Integer,Float>(100,0.75f){
//            @Override
//            protected boolean removeEldestEntry(Map.Entry eldest) {
//                return size()>100;
//            }
//        });
//        Read read = new Read();
//        for (int j = 0; j < 2; j++) {
//            new Thread(()->{
//                try {
//                    Read.read();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }).start();
//        }
        Read read = new Read();


  }

}
class Read extends Do{

    public Read(){};
    public static synchronized void read() throws InterruptedException {
        System.out.println("read");
        Thread.sleep(5);
    }

    }
    class Do{
    public Do(){
        System.out.println("do被初始化了");
    }
    }

