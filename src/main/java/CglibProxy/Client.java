package CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class Client {


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(HelloService.class);
//        enhancer.setCallback(new CglibTest());
        HelloService hello = (HelloService) enhancer.create(HelloService.class, new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("时间开始"+new Date()+method.getName());
                Object obj = methodProxy.invokeSuper(o,objects);
                System.out.println("时间结束"+new Date());
                return obj;
            }
        });
        hello.sayHello();
//
//        Proxy.newProxyInstance(Client.class.getClassLoader(), Client.class.getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("");
//                Object obj = method.invoke(new Object(),args);
//                System.out.println("");
//                return obj;
//            }
//        });

    }
}
