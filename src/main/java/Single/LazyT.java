package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyT {
    private static boolean is = false;
    private LazyT(){
        if (is==false) is=true;else throw  new RuntimeException("不要试图用反射破坏");
    }
    private volatile LazyT lazyT;
    public LazyT getLazyT(){//DCL
        if(lazyT==null)
            synchronized (LazyT.class) {
                if (lazyT == null) {
                    lazyT = new LazyT();//不是原子性操作
                    is=false;
                }/*
                1.分配内存空间
                2.执行构造方法初始化对象
                3.让对象指向这个空间
                当指令重排可能使其执行1.3.2，当它走到2时，另一个线程可能会直接将其return，因此为了避免指令重排，需要将其volatile
                 */

            }return lazyT;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazyT l = new LazyT().getLazyT();
        Constructor c =  LazyT.class.getDeclaredConstructor();
        c.setAccessible(false);
        LazyT l = (LazyT) c.newInstance();

        LazyT l2 = (LazyT) c.newInstance();
        System.out.println(l);
        System.out.println(l2);
    }
}
