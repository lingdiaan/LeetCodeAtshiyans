package haoweilai;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[][] ans = new  Main().promotions(4,2);
//        for (int i = 0; i <ans.length ; i++) {
//            for (int j = 0; j < ans[0].length; j++) {
//                System.out.println(ans[i][j]);
//            }
//
//        }
//        List<Integer> l = new ArrayList<>();
//
        int a = 1;
        int b = 2;



    }
    public int[][] promotions (int n, int k) {
        // write code here
        int c = n;
        int mor = 1;
        while(c!=k){
            mor=c*mor;
            c--;
        }
        c=k;
        while(c!=0){
            mor=mor/c;
            c--;
        }
        int[][] ans = new int[mor][k];

        int[] num = new int[n];
        for(int i=0;i<n;i++)
            num[i]=i+1;
        int begin=0;
        for(int i=0;i<1<<n;i++){
            int count = 0;
            int[] count1 = new int[n];
            int d=i;
            int j=0;
            boolean flag = true;
            while(d!=0){
                count1[j++]=d%2;
                if(d%2==1)count++;
                d=d/2;

                if(count>k){flag = false;break;}
            }
            if(flag==false||count!=k) continue;
            int start = 0;
            for (int l = 0; l < count1.length; l++) {
                if(count1[l]==1) {
                    ans[begin][start++] = num[l];

                }
            }
            begin++;


        }
        Arrays.sort(ans, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0]-o2[0];
            }
        });
        return  ans;
    }

//    public void dfs(int n,int k,int begin,Deque<Integer> path,List<List<Integer>> res){
//        if(path.size()==k){
//            res.add(new ArrayList<>(path));
//        }
//        for (int i = begin; i <=n; i++) {
//            path.add(i);
//            dfs(n,k,i+1,path,res);
//            path.remove(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] ans = new Main().promotions(4,2);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans[0].length; j++) {
//                System.out.println(ans[i][j]);
//            }
//        }
//    }
//    public int[][] promotions (int n, int k) {
//
//        List<List<Integer>> res = new ArrayList<>();
//        dfs(n,k,1,new ArrayDeque<>(),res);
//        int[][] ans = new int[res.size()][res.get(0).size()];
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(0).size(); j++) {
//                ans[i][j]=res.get(i).get(j);
//            }
//
//        }
//        return ans;
//     }
}
