import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TryCatchTest {
    public static void main(String[] args) throws Exception {
//          try{
//            try0();
//        }catch (Exception e){
//
//              catch0(e);
//          }finally {
//              finally0();
//        }
        MyThread myThread = new MyThread();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myThread);
        new Thread(integerFutureTask).start();


    }


    public static void try0(){}
    public static void catch0(Exception e) throws Exception {throw  e;}
    public static void finally0(){}


}
class MyThread implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 5555;
    }
}
