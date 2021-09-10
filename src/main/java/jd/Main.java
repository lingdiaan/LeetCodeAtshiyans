package jd;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        boolean flag = true;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(i>0&&a[i]!=a[i-1]) flag=false;
        }
        if(flag) for (int i = 0; i < n-1; i++) {
            System.out.println(0);
        }
        else {
            int[] ans = new int[n-1];
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                for (int j = 0; j < Integer.MAX_VALUE ; j++) {
                         int count = 0;
                    for (int k = 0; k < n; k++) {

                    }
                }
            }


        }
    }
}
