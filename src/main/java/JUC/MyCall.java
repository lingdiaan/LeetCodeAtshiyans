package JUC;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCall {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable m = new Mycall2();
        FutureTask f = new FutureTask(m);
        Thread t = new Thread(f);
        t.start();
        System.out.println(f.get());
    }
}

class Mycall2 implements Callable<String>{

    @Override
    public String call() throws Exception {
        System.out.println("Call方法执行");
        return "java";
    }
}
