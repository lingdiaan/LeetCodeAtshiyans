package meituan2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 射箭比赛
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] ndis = new int[n];
        int[] mdis = new int[m];
        for (int i = 0; i < n; i++) {
            ndis[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            mdis[i] = scanner.nextInt();
        }
        Arrays.sort(mdis);
        Arrays.sort(ndis);
        int score = 0;
        for (int i = 0; i < m; i++) {
            if(mdis[i]>ndis[n-1]) score+=2;
            else score++;
        }
        System.out.println(score-n);

    }
}
