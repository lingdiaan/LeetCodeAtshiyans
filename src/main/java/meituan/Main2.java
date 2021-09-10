package meituan;
import java.util.*;
/*
讨厌数字
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        int num;
        int ans = 0;
        int len = String.valueOf(k).length();
        for (int i = 0; i < n; i++) {
            num=scanner.nextInt();
            String s = split(num);
            for (int j = 0; j <=s.length()-len ; j++) {
                if(s.substring(j,j+len).equals(String.valueOf(k))){

                    ans++;
                    break;
                }
            }

        }
        System.out.println(ans);



    }
    public static String split(int count){
StringBuilder s = new StringBuilder();
        for (int i = 1; i <=count ; i++) {
            if (count%i==0)
                s.append(i);
        }
        return s.toString();
    }
}
/*
5 13
13 31 10 9 20
 */