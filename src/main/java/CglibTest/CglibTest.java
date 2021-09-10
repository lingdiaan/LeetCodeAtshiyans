package CglibTest;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务执行前");
        Object obj = methodProxy.invokeSuper(o,objects);
        System.out.println("事务执行结束");
        return null;
    }
}
