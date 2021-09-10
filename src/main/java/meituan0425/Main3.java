package meituan0425;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int[] ball = new int[n];
            for (int j = 0; j <n ; j++) {
                ball[j] = scanner.nextInt();
            }
        }
    }
}
