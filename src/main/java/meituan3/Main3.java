package meituan3;

import java.util.Scanner;

/**
 * 弹吉他
 */
public class Main3 {
    private static int t;
    private static long ans;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            ans = 0;
            int x = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] score = new int[n][4];
            score[0][0] = x+b;
            score[0][1] = 0;
            score[0][2] = Math.max(x-a,0);
            score[0][3] = x;
            for (int j = 1; j < n; j++) {
                if(score[j-1][0]+score[j-1][1]>score[j-1][2]+score[j-1][3]||(score[j-1][0]+score[j-1][1]==score[j-1][2]+score[j-1][3])&&score[j-1][0]>score[j-1][2]){
                    score[j][0] = score[j-1][0]+b;
                    score[j][1] = score[j-1][1];
                    score[j][3] = score[j-1][0]+score[j-1][1];
                    score[j][2] = Math.max(score[j-1][0]-a,0);
                }
                else if(score[j-1][0]+score[j-1][1]<score[j-1][2]+score[j-1][3]||(score[j-1][0]+score[j-1][1]==score[j-1][2]+score[j-1][3])&&score[j-1][0]<score[j-1][2]){
                    score[j][0] = score[j-1][2]+b;
                    score[j][1] = score[j-1][3];
                    score[j][3] = score[j-1][2]+score[j-1][3];
                    score[j][2] = Math.max(score[j-1][2]-a,0);
                }

            }
            System.out.println(Math.max(score[n-1][1],score[n-1][3]));
        }

    }

    }


