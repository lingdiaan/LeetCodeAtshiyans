package albb;

import java.util.Scanner;

public class Main3 {

    //从指定位置开始反转
    private static void reverse(int [] arr,int from,int to) {
        while(from<to){
            int tmp=arr[from];
            arr[from++]=arr[to];
            arr[to--]=tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i <=n ; i++) {
            nums[i]=i;

        }
        for (int i = 0; i < k; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            reverse(nums,l,r);
        }
    }

}
