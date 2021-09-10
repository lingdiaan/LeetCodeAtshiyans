package meituan;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n, k;
            n = in.nextInt();
            k = in.nextInt();
            int[] nums = new int[n];
            int res = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
                String strL = "";
                String strR = "";
                int p=0;
                for (int j = 1; j <= Math.sqrt(nums[i]); j++) {
                    if (nums[i] % j == 0) {
                        if (j == k) {
                            res++;
                            p=1;
                            break;
                        }
                        if (nums[i] / j == k) {
                            res++;
                            p=1;
                            break;
                        }
                        strL += j;
                        strR = nums[i] / j + strR;
                    }
                }
                if (p==0){
                    String str = strL + strR;
                    if (str.indexOf(String.valueOf(k)) >= 0) {
                        res++;
                    }
                }

            }
            System.out.println(res);

        }
    }
}
