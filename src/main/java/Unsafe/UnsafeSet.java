package Unsafe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

public class UnsafeSet {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
        Set<String> set = new HashSet<>();
//        Set<String> set2 = Collections.synchronizedSet(set);
        Set<String> set2 = new  CopyOnWriteArraySet<>();
        for (int i = 0; i < 50; i++) {
            new Thread(()->{set2.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set2);}).start();

        }

    }
}
