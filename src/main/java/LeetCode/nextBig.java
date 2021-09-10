package LeetCode;

import java.util.*;
public class nextBig {
    public static void main(String[] args) {
        int[] a = new int[]{1,5,6,4,2,7,3,1};
        new nextBig().nextPermutation(a);
        for(int i:a) System.out.println(i);
    }
    public void nextPermutation(int[] nums) {
        int i;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
                break;
        }
        System.out.println();
        if(i==0){
            Arrays.sort(nums);
            return;}
        i--;
        int minx = nums.length-1;
        int minj=minx;
        int min = Integer.MAX_VALUE;
        for(int j = minx;j>=i;j--){
            if(nums[j]>nums[i]&&nums[j]<min){
                minj=j;
                min=nums[j];
                System.out.println("minj=minx"+nums[minj]);
            }
        }
        System.out.println("nums[i]="+nums[i]);
        int temp = nums[i];
        nums[i]=nums[minj];
        System.out.println("nums[minj]="+nums[minj]);
        nums[minj]=temp;
        Arrays.sort(nums,i+1,nums.length);
    }
}
