package JUC;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock(true);
    }
}
