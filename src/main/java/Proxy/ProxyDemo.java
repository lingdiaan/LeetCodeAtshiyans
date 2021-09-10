package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object obj = method.invoke(target,args);
        return obj;
    }

    public Object getProxy(){
        Object obj = Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        return obj;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
