package albb;

import java.util.ArrayList;
import java.util.Scanner;
/**
第二题
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n+1];
        for (int i = 0; i <n+1 ; i++) {
            nums[i]=i;
        }
        for (int i = 0; i < k; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            reverse(nums,l,r);
        }
        for (int i = 1; i <n ; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.print(nums[n]);
    }

    //从指定位置开始反转
    private static void reverse(int [] arr,int from,int to) {
        while(from<to){
            int tmp=arr[from];
            arr[from++]=arr[to];
            arr[to--]=tmp;
        }
    }
}


//    public static void reverse(int[] nums,int l,int r){
//        StringBuilder sb = new StringBuilder();
//        for (int i = l; i <=r ; i++) {
//            sb.append(nums[i]);
//        }
//        sb.reverse();
//        for (int i = l; i <=r ; i++) {
//            nums[i]=sb.charAt(i-l)-'0';
//        }
//    }
