import java.lang.ref.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReferenceTest {
    public static void main(String[] args) {
//        YinyongTest y = new YinyongTest();
//        y=null;
//        System.gc();

        //软引用
//        SoftReference<byte[]> s = new SoftReference<>(new byte[1024*1024*10]);
//        System.out.println(s.get());
//        System.gc();
//        System.out.println(s.get());
//
//        byte[] by=new byte[1024*1024*10];
//        System.out.println(s.get());

        //弱引用
//        WeakReference<byte[]> w = new WeakReference<>(new byte[1024*1024*10]);
//        System.out.println(w.get());
//        System.gc();
//        System.out.println(w.get());

        //虚引用
        ReferenceQueue queue = new ReferenceQueue();
        List<byte[]> bytes = new ArrayList<>();
        PhantomReference<ReferenceTest> reference = new PhantomReference<ReferenceTest>(new ReferenceTest(),queue);
        new Thread(() -> {
            for (int i = 0; i < 100;i++ ) {
                bytes.add(new byte[1024 * 1024]);
            }
        }).start();
        ThreadLocal t = new ThreadLocal();


        new Thread(() -> {
            while (true) {

                Reference poll = queue.poll();
                if (poll != null) {
                    System.out.println("虚引用被回收了：" + poll);
                }
            }
        }).start();
        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
    }



    @Override
    protected void finalize() throws Throwable {
        System.out.println("Yinyong被回收了");
//        super.finalize();

    }
}
