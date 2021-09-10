package meituan0425;

import java.util.Scanner;

/**
 * 画方块写作文
 */
public class Main4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='.') map[i][j]=1;
                else map[i][j]=0;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    ans++;
                    if (i > 0 && map[i - 1][j] == 1) {
                        ans++;
                    }
                    if (j > 0 && map[i][j - 1] == 1) {
                        ans++;
                    }
                    if (i > 0 && j > 0 && map[i - 1][j] == 1 && map[i][j - 1] == 1 && map[i - 1][j - 1] == 1) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
