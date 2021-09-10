package JUC;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteTest {
    public static void main(String[] args) {
        Artical a = new Artical();
        for (int i = 0; i < 50; i++) {

            new Thread(()->{
                try {
                    a.read();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        for (int i = 0; i < 50; i++) {

            new Thread(()->{
                try {
                    a.write();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}

class Artical{
    ReentrantReadWriteLock r = new ReentrantReadWriteLock();
    public void read() throws InterruptedException {
        r.readLock().lock();
        System.out.println(Thread.currentThread().getName()+"正在读");
        TimeUnit.SECONDS.sleep(2);
        r.readLock().unlock();
    }

    public void write() throws InterruptedException {
        r.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+"正在写");
        TimeUnit.SECONDS.sleep(2);
        r.writeLock().unlock();
    }
}

class Cache{
    Map<String,Object> cache = new HashMap<>();
    ReentrantReadWriteLock r = new ReentrantReadWriteLock();
    public void put(String key,Object value){
        r.writeLock().lock();
        System.out.println("写入"+key);
        cache.put(key,value);
        System.out.println("写入完毕");
        r.writeLock().unlock();
    }
    public Object get(String key){
        r.readLock().lock();
        System.out.println("读取"+key);
        Object o=  cache.get(key);
        System.out.println("读取完毕");
        r.readLock().unlock();
        return o;
    }
}