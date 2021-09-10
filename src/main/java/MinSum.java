import java.util.*;
public class MinSum {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0]=1;
        arr[1]=3;
        arr[2]=5;
        arr[3]=2;
        arr[4]=4;
        arr[5]=6;

        int x =getSmallSum(arr);
        System.out.println(x);

    }
    public static int getSmallSum(int[] arr){
        if(arr==null||arr.length==0){
            return  0;
        }
        return func(arr,0,arr.length-1);
    }

    public static int func(int[] arr,int l,int r){
        if(l==r) return 0;
        int mid=(l+r)/2;
        return func(arr,l,mid)+func(arr,mid+1,r)+merge(arr,l,mid,r);
    }

    public static int merge(int[] s, int left, int mid, int right){

        int[] h = new int[right-left+1];
        int hi = 0;
        int i =left;
        int j =mid+1;
        int smallSum = 0;
        while (i<=mid && j<=right) {
            if(s[i]<=s[j]){
                smallSum +=s[i]*(right-j+1);
                h[hi++]=s[i++];
            }else {
                h[hi++]=s[j++];
            }

        }

        for( ;((j<right+1) ||(i<mid+1)); j++, i++){
            h[hi++]= i>mid ?s[j]:s[i];
        }
        for(int k=0; k!=h.length; k++){
            s[left++]=h[k];
        }
        return smallSum;
    }



}
