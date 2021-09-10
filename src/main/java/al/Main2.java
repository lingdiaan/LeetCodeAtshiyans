package al;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main2 {
    private static int[] u,v,w;
    private static int ans;
    private static Map<Integer,List<Integer>> map;
    private static int[] a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int T = scanner.nextInt();
        a = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            a[i]=scanner.nextInt();
        }
        u = new int[n-1];
        v = new int[n-1];
        w = new int[n-1];
        map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            u[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
            List<Integer> son = map.getOrDefault(u[i],new ArrayList<>());
            son.add(v[i]);
            List<Integer> father = map.getOrDefault(v[i],new ArrayList<>());
            father.add(u[i]);
            map.put(u[i],son);
            map.put(v[i],father);
        }
        for (int i = 0; i < n; i++) {
            dfs(i,T,i,0);
        }
        System.out.println(ans);


    }
    public static void dfs(int i,int t,int start,int count){
        if(t==0&&i==start){
            ans = Math.max(count,ans);
            return;
        }
        if(i>v.length-1) return;
        if(map.containsKey(v[i])){
        List<Integer> list = map.get(v[i]);
        dfs(i+1,t,start,count);
        for (int num:list)
        dfs(num,t-w[i],start,count+a[i]);


    }}



}
