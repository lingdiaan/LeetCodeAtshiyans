package baidu;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int v[] = new int[m];
        int u[] = new int[m];
        int max = n;
        int min = 0;
//        Map<Integer,Integer>
        for (int i = 0; i < m; i++) {
            u[i] = scanner.nextInt();
            v[i] = scanner.nextInt();

            if(u[i]==p) max--;
            if(v[i]==p) min++;
        }
        for (int i = min; i <max ; i++) {
            System.out.print(i+" ");
        }
        System.out.print(max);

    }
}
