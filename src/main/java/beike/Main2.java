package beike;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] bings = new int[n];
        TreeSet<Integer> tree = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            bings[i] = scanner.nextInt();
            map.put(bings[i],map.getOrDefault(bings[i],0)+1);
            tree.add(bings[i]);
        }
        int count = 0;
        while (!tree.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int v:tree){
                int val = map.get(v);
                map.put(v,val-1);
                if(val-1==0)list.add(v);
            }
            for (int i : list)
                tree.remove(i);
            count++;
        }
        System.out.println(count);

    }
}
/**
 7 4 9 7 7 3 3 2
 */