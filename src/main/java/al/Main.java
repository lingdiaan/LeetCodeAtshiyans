package al;

import java.util.Scanner;

/**
 * 逆序对
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            nums[i]=i;
        }
        for (int i = 0; i < k; i++) {
int start = scanner.nextInt();
int end = scanner.nextInt();
StringBuilder sb = new StringBuilder();
            for (int j = start; j <= end; j++) {
                sb.append(j);

            }
            sb.reverse();
            int[] newNums = new int[n+1];
            for (int j = 0; j < n+1; j++) {
                if(j>=start&&j<=end)newNums[j] = sb.toString().charAt(j-start)-'0';
                else newNums[j] = j;
            }
            nums = newNums;
//reverse(start,end,nums);
        }
        int ans = 0;
        for (int i = 0; i < n+1; i++) {
            for (int j = i+1; j < n+1; j++) {
                if(nums[j]<nums[i]) ans++;
            }
        }
        System.out.println(ans);

    }
    public static void reverse(int start,int end ,int[] nums){
        while(start<end){
            nums[start]=nums[start]+nums[end];
            nums[end] = nums[start]-nums[end];
            nums[start]=nums[start]-nums[end];
            start++;
            end--;
        }
    }
}
