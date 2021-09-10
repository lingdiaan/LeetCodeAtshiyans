package meituan;

import java.util.Scanner;
/*
跳方格
 */
public class Main4 {
    private static int[][] dis;
    private static int min;
    private static boolean[][] isVisti;
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int k = scanner.nextInt();
        dis = new int[n][n];
        min = Integer.MAX_VALUE;
        isVisti = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dis[i][j]=scanner.nextInt();
                isVisti[i][j]=false;
            }
        }

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(dis[i][j]==1)
                    dfs(k,i,j,0,1);
            }
        }
        if(min!=Integer.MAX_VALUE)
        System.out.println(min);
        else System.out.println(-1);
    }
    public static void dfs(int k,int i,int j,int count,int now){
        if(dis[i][j]==k&&now==k){
            min = Math.min(min,count);
            return ;
        }
        if(dis[i][j]!=now) return;
        if (isVisti[i][j]==true)return ;
        isVisti[i][j]=true;
        if(i>0) {
            dfs(k, i - 1, j, count + 1,now+1);
            if(j>0)
                dfs(k,i-1,j-1,count+2,now+1);
            if(j<n-1)
                dfs(k,i-1,j+1,count+2,now+1);
        }
        if(i<n-1){
            dfs(k,i+1,j,count+1,now+1);
            if (j>0)
                dfs(k,i+1,j-1,count+2,now+1);
            if(j<n-1)
                dfs(k,i+1,j+1,count+2,now+1);
        }
        if(j>0)
            dfs(k,i,j-1,count+1,now+1);
        if(j<n-1)
            dfs(k, i, j+1, count+1,now+1);
        isVisti[i][j]=false;


    }
}
/*
2 2
1 2
2 1
 */

/*
4 4
1 2 2 1
2 4 4 1
4 4 4 2
1 1 1 2
 */