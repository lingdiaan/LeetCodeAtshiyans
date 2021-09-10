package beike;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
        int n = 10000;
        int k = 5000;
        int[] nums = new int[n];
        int big = 0;
        int small = 0;
        int[][] scores = new int[n][n];

//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//            if(nums[i]>k) {
//                big++;
//
//            }
//            if(nums[i]<k) {
//                small++;
//            }
//        }
        for (int i = 0; i <10000 ; i++) {
nums[i] = i;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            scores[i][i] = nums[i]>k?1:-1;
            for (int j = i+1; j < n; j++) {
                int c = nums[j]>k?1:-1;
                scores[i][j] = scores[i][j-1]+c;
                if(scores[i][j]>0&&j-i>=2){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        System.out.println(ans);

    }
}
