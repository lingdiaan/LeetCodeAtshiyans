package LeetCode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class abc {
    public static void main(String[] args){

//        new Test2().permutation("LeetCode.abc");
        int[] z = new int[]{7,4,5,3,2,8,6,9};
        Arrays.sort(z,2,6);
        for(int i:z) System.out.println(i);
    }
    Set<String> set = new HashSet<>();
    List<String> ans = new LinkedList<>();


    public String[] permutation(String s) {

        char a[] = s.toCharArray();
        digui(a,0);
        String[] aa = new String[ans.size()];
return null;
    }
    public void digui(char[] a,int start){
        if(start==a.length-1){
            return;
        }
        for(int i=start;i<a.length;i++){
            for(int j=start+1;j<a.length;j++){
                swap(a,i,j);
                StringBuilder sb= new StringBuilder();
                for(char c:a) sb.append(c);
                if(!set.contains(sb.toString()))
                    ans.add(sb.toString());
                set.add(sb.toString());
                digui(a,i+1);
                swap(a,i,j);

            }
        }
    }
    public void swap(char[] a, int i,int j){
        char s = a[i];
        a[i]=a[j];
        a[j]=s;
    }

}