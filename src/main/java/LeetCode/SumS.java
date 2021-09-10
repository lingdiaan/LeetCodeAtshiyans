package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SumS {

    public static void main(String[] args) {
              int[][] a = new SumS().findContinuousSequence(50);
              for(int[] i:a){
                  for (int b:i)
                      System.out.print(b+" ");
                  System.out.println("-----------------");
              }

    }
    public int[][] findContinuousSequence(int target) {
        List<int[]> ans = new ArrayList<>();
        for(int i=1,j=2;i<j;){
            int sum = (i+j)*(j-i+1)/2;
            int[] res = new int[j-i+1];
            if(sum==target) {for(int k=0;k<j-i+1;k++) res[k]=i+k; ans.add(res);j++;i++;}
                if(sum>target) i++;
                if(sum<target) j++;
        }
        return ans.toArray(new int[ans.size()][]);

    }
}
