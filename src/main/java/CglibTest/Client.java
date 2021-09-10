package CglibTest;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Host.class);
//        enhancer.setCallback(new CglibTest());
        Host obj = (Host)enhancer.create(Host.class,new CglibTest());
        obj.rent();

    }
}
