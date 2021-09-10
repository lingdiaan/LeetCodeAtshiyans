package JUC;

import java.util.concurrent.atomic.AtomicReference;

//自己的自旋锁
public class MyLock {
    AtomicReference<Thread> a = new AtomicReference();

    //加锁
    public void addLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"====>mylock");
        while(!a.compareAndSet(null,thread)){

        }
    }

    //解锁
    public void unLock(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"====>mylock");
        while(a.compareAndSet(thread,null)){

        }
    }


}
