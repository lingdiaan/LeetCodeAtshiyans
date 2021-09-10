package jd2;
import java.util.Scanner;
public class Main2 {
    private static int ans;
    private static int[] nums;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nums = new int[n+1];
        ans = 0;

        digui(0,n);
        System.out.println(ans);
    }
    public static void digui(int n,int end){

        if(n==end){
            nums[end]=1;
            if(istrue(nums)){
            ans++;
            return;
        }
        }else if(n>end||n<0||nums[n]==1) return;
        else{
            nums[n]=1;
            digui(n+1,end);
            digui(n+2,end);
            digui(n-1,end);
            digui(n-2,end);
            nums[n]=0;
        }

    }
    public static boolean istrue(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0)
                return false;
        }
        return true;
    }
}
