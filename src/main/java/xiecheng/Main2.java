package xiecheng;

import java.util.*;

public class Main2 {
    public static int ans;
    public static Map<Integer, List<Integer>> map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] station = scanner.nextLine().trim().split(" ");
        String[] startAndEnd = scanner.nextLine().trim().split(" ");
        int k = Integer.parseInt(scanner.nextLine().trim());
        map = new HashMap<>();
        for (int i = 0; i <station.length ; i++) {
            int start = station[i].charAt(0)-'0';
            int end = station[i].charAt(2)-'0';
            List<Integer> list = map.getOrDefault(start, new ArrayList<>());
            list.add(end);
            map.put(start,list);

        }
        dfs(k,Integer.parseInt(startAndEnd[0]),Integer.parseInt(startAndEnd[1]));
        System.out.println(ans);

    }
    public static void dfs(int k,int start, int end){
        if(k<-1) return;
        if (start==end) {
            ans++;
            return;
        }
        List<Integer> list = map.get(start);
        for (int i :list){
            dfs(k-1,i,end);
        }

    }
}
/*
3
1,2 2,3 1,3
1 3
1
 */