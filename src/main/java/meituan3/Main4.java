package meituan3;

import java.util.Scanner;

public class Main4 {
    private static int ans = Integer.MAX_VALUE;
    private static int n;
    private static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().trim().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine().trim();
            for (int j = 0; j < m; j++) {
                map[i][j] = a.charAt(j);
            }
        }
        start(map,1,0,0,0);

    }
    public static void start(char[][] map,int op,int i,int j,int score){
        if (i==n&&j==m) ans = Math.min(ans,score);
        if(i>=n||j>=m||i<0||j<0) return;
        else{
            if((i>=n||j>=m||i<0||j<0)&&map[i][j+1]!='*'){
                start(map,op,i,j+1,score+1);
            }
            if((i>=n||j>=m||i<0||j<0)&&map[i+1][j]!='*')
                start(map,op,i+1,j,score+1);
            if((i>=n||j>=m||i<0||j<0)&&map[i-1][j]!='*')
                start(map,op,i-1,j,score+1);
            if((i>=n||j>=m||i<0||j<0)&&map[i][j-1]!='*');
        }
    }
}
