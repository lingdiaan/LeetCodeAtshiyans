import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadListTest {
    private volatile static int i;
    public static void main(String[] args) {
//        List<Thread> list = new ArrayList<>();
//        for (i = 0; i < 1000; i++) {
//            Thread thread = new Thread(() -> {
//                System.out.println(i);
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//
//            list.add(thread);
//            thread.start();
//        }
//        System.out.println("over");
    int[] a = new int[]{24,12,5,25,27,6,9,31,8,16,33,37,4,29,10,15,1,26,17,14,12,18,20,28,2,37,26,4,22,34,35,32,19,13,30,4,4,22,36,7,4,3};
        Arrays.sort(a);
        for (int i: a
             ) {
            System.out.print(i+",");
        }
    }
}
