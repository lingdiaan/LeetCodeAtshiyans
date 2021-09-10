package jd2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        long[] count = new long[n-k+1];
        for (int i = 0; i < k; i++) {
            count[0]+=nums[i];
        }
        for (int i = 1; i <n+1-k ; i++) {
            count[i]=count[i-1]+nums[i+k-1]-nums[i-1];
        }
        long max=0,maxx=0;
        for (int i = 0; i < n-k+1; i++) {
            if(count[i]>max){
                max = count[i];
                maxx=i+k/2;
            }
        }
        System.out.println(maxx+1);
    }
}
/**
 10 3 5 5 5 10 10 10 5 10 10 10
 */