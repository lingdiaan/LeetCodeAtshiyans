package Proxy;

import java.lang.reflect.Method;

public class Client {


    public static void main(String[] args) throws NoSuchMethodException {


        fangdong fangdong = new fangdong();
//        ProxyDemo p = new ProxyDemo();
//        p.setTarget(fangdong);
//        Rent r = (Rent) p.getProxy();
//        r.rent();
        Class m = fangdong.getClass();
        System.out.println(m.getDeclaredConstructor());
        System.out.println(m.getName());
        System.out.println(m.getSimpleName());
        for (Class anInterface : m.getInterfaces()) {
            System.out.println(anInterface.getName());
        }
        ;
    }
}
