package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Lazy {//可以被反射破坏
    private boolean yj = false;
    private Lazy(){

        synchronized (Lazy.class){
            if(yj==false)yj=true;else throw new RuntimeException("不要试图用反射破坏");}
    }
    private volatile static Lazy lazy;
    public static Lazy getLazy(){//DCL 懒汉式

        if(lazy==null){
            synchronized (Lazy.class){

                if(lazy==null)
                lazy = new  Lazy();//不是原子性
                /*
                分配内存空间
                执行构造方法，初始化对象
                把这个对象指向这个空间

                当一个线程A乱序执行new Single.Lazy  1 3 2 ，当执行到3的时候，另一个线程进入，发现lazy！=null就直接return，但此时lazy没有完成构造。
                 */

        }
            }
        //单线程OK，return lazy;
        return lazy;


    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//Single.Lazy lazy = Single.Lazy.getLazy();
Constructor<Lazy>de = Lazy.class.getDeclaredConstructor();
de.setAccessible(true);
        Lazy lazy2 = de.newInstance();
        Lazy lazy = de.newInstance();
        System.out.println(lazy==lazy2);

    }
}
