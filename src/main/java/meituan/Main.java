package meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] c = s.toCharArray();
        System.out.println(c.toString());
        int ans = 0,count=0;
        for(int i=0;i<1<<s.length();i++){
            Set<Character> set = new HashSet<>();
            int[] countArr = split(i,s.length());
            boolean flag = true;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < countArr.length; j++) {
                if(countArr[j]==1&&set.contains(c[j])) {
                    flag = false;
                    break;
                }
                else if(countArr[j]==1) {
                    set.add(c[j]);
                    sb.append(c[j]);
                }

            }
            count++;
            if (flag==true) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int[] split(int count,int length){
       int[] arr =  new int[length];
       int start = 0;
       while(count!=0){
           arr[start]=count%2;
           count/=2;
           start++;
       }
       return arr;
    }
}
