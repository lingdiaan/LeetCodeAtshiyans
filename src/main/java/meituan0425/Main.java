package meituan0425;
/**
 * 第一题
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int mus = scanner.nextInt();
            int first = mus/c;
            int sec = mus%c;
            char ans;
            if(sec!=0){
            ans = (char) ('A'+first);}
            else ans = (char)('A'+first-1);
            System.out.print(ans);
            System.out.println(sec);
        }

    }
}
