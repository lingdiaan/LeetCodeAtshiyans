package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前");
        seeHouse();
        Object obj = new Object();
        obj=method.invoke(rent,args);
        System.out.println("方法执行后");
        return obj;
    }

    public static void main(String[] args) {
Rent o = (Rent)new ProxyTest().getProxy();
o.rent();

    }
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);

    }
    public void seeHouse(){
        if(rent.getClass()==fangdong.class)
        System.out.println("房东来看房");
        else System.out.println("房客来看房");
    }

}
