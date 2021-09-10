package LeetCode;
import java.util.*;

public class ThearNumSun {

    public Object threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<int[]> set = new HashSet<>();
        for(int i=1;i<nums.length;i++){
            int start = 0, end = nums.length;

            while(start<end){
                int sum = nums[start]+nums[i]+nums[end];
                if(sum==0){
                    int[] ans = new int[]{nums[start],nums[i],nums[end]};
                    if(!set.contains(ans)){
                        set.add(ans);
                    }
                    break;
                }


            }
        }
        return set.toArray();

    }

    public static void main(String[] args) {
        new ThearNumSun().threeSum(new int[]{-1,0,1,1});
    }
}

