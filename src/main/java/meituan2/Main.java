package meituan2;
/**
 * 给定一个长度为n只包含0和1的数列
 */
import java.util.*;
public class Main {
    private static int max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        int a=0;int b=0;
        String s = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            nums[i]=s.charAt(i)-'0';
            if (nums[i]==0)a++;
            if(nums[i]==1)b++;
        }
        max = Math.max(max,Math.abs(a-b));
        int[] count = new int[n-2];
        for (int i = 0; i < count.length; i++) {
            for (int j = i; j < i+3; j++) {
                if(nums[j]==1) count[i]++;
                if(nums[j]==0) count[i]--;
            }
            if(count[i]>0) a++;
            if(count[i]<0) b++;
        }
        if(a<b) for (int i = 0; i < count.length; i++) {
            count[i]=0-count[i];

        }
            for (int i = 0; i < count.length; i++) {
                int ans = 0;
                if(count[i]>0)
                for (int j = i; j < count.length; j=j+3) {
                    if(count[j]>0) ans+=count[i];
                    else j-=2;
                }
                max = Math.max(ans,max);
        }
        System.out.println(max);
    }
//    public static void delete(int[] nums,int a,int b,int start){
//        for (int i = start; i <start+3; i++) {
//            if(nums[i]==0) a--;
//            if(nums[i]==1) b--;
//
//        }
//        max = Math.max(max,Math.abs(a-b));
//        for(int i=start+3;i<nums.length-3;i++) delete(nums,a,b,i);
//    };
}
