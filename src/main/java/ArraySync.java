import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class ArraySync {
    public static void main(String[] args) throws InterruptedException {
//        CopyOnWriteArrayList<String> cs = new CopyOnWriteArrayList<>();
        List<String> cs = new ArrayList<>();
        for(int i=0;i<20;i++){
            new Thread(()->{cs.add("123321");System.out.println(cs.toString());}).start();
        }
    }
}
