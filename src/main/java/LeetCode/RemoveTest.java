package LeetCode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.*;

public class RemoveTest extends Thread{
    private volatile static  boolean flag = true;
    private volatile static Stack<Thread> s;
    public static void main(String[] args) throws InterruptedException, IllegalAccessException, InstantiationException {

//        ExecutorService e = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            MyThread my = new MyThread();
//            e.execute(my);
//
//        }
//        e.shutdown();
//    }
//        Callable<Object> c = new LeetCode.MyCall();
//        FutureTask<Object> f = new FutureTask<>(c);
//        Thread my = new Thread(f);
//        my.start();
//        my.stop();

//        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
//        threadLocal.set(5);
//        Thread thread = new LeetCode.RemoveTest();
//
//
//      ExecutorService e = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 5; i++) {
//            e.execute(new Runnable() {
//                @Override
//                public void run() {
//
//                    threadLocal.set(1);
//                    while(true){
//                        System.out.println("方法执行了"+new Date());
//                    }
//                }
//            });
//
//        }
//Thread.sleep(5000);
//        e.shutdownNow();
//
//        Object o = new Object();
        Class r = RemoveTest.class;

        RemoveTest re = new RemoveTest();
        r=re.getClass();
Class [] me = r.getInterfaces();
        Proxy.newProxyInstance(r.getClassLoader(), me, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });


    }

    @Override
    public void run() {
        while(true){
            System.out.println("方法执行了"+new Date());
        }
    }

static class MyThread implements Runnable{
    @Override
    public void run() {

        try {
            Thread.sleep(2000);
            while (!s.isEmpty()){
                Thread t = s.pop();
                t.interrupt();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}

class MyCall implements Callable{
    @Override
    public Object call() throws Exception {
        System.out.println("执行了该方法"+Thread.currentThread().getName());
        Thread.interrupted();
        return null;
    }
}