package LeetCode;/*
有n（n小于10）个班级，m（m小1000）个学生，围成一个圈，我们要找到圈中的一部分。这部分要包含每个班级的最少一名同学，并且使这个部分尽可能的小。
 */

import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =scanner.nextInt();
        int[] str = new int[m];
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<m;i++){
            str[i]=scanner.nextInt();
        }
            Date start = new Date();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=0,k=i;j<m;j++,k++){
                k=k%m;
                set.add(str[k]);
                if(set.size()==n){
                    if(k<i)
                    ans = Math.min(ans,m-i+k+1);
                    else ans = Math.min(ans,k-i+1);
                    break;
                }


            }
        }


        System.out.println(ans);
    }
}

/*
9 7 6 6 4 5 2 6 0 3 0 3 3 1 2 2 2 8 3 2 4 4 9 4 6 8 9 3 3 0 5 4 2 8 5 2 7 6 8 0 1 1 4 6 0 8 7 9 9 2 7 5 8 3 0 9 7 7 0 5 7 1 3 8 0 8 3 6 0 1 6 1 0 1 6 3 5 4 3 4 6 7 9 5 9 7 2 7 2 8 3 2 5 6 2 3 8 5 4 4 0 0 6 0 7 4 8 8 1 7 2 2 8 0 3 2 0 4 6 0 1 4 1 7 2 1 3 6 0 3 6 6 9 3 0 4 6 0 9 2 1 9 4 1 8 6 2 2 9 4 3 3 7 3 7 7 6 3 4 4 0 5 8 9 3 9 5 1 6 5 8 2 0 7 9 1 5 3 8 5 4 4 7 1 1 7 0 1 8 9 0 5 3 5 8 8 3 6 8 6 7 0 5 5 3 7 4 9 7 8 9 5 0 5 8 3 1 0 9 6 6 8 9 8 0 1 0 6 9 5 6 0 5 5 4 7 4 2 9 3 1 0 1 0 0 6 4 5 2 0 9 2 5 5 0 7 6 2 9 0 5 1 5 9 8 9 8 9 1 9 4 3 6 8 8 1 5 0 8 4 8 1 3 2 8 8 8 6 2 4 3 6 2 7 8 4 8 6 4 5 6 6 5 6 8 1 9 4 4 3 6 4 1 5 6 3 8 3 3 2 7 1 8 9 1 3 7 2 7 1 5 5 5 3 7 8 5 9 2 4 9 9 7 6 1 4 3 3 3 5 4 9 4 3 7 6 8 8 8 3 6 6 3 6 5 4 5 1 5 4 5 0 1 9 8 2 6 7 6 7 6 7 6 3 9 8 8 8 0 7 2 6 4 8 6 7 0 7 4 9 3 5 7 9 0 5 3 4 2 3 9 7 2 6 9 4 9 5 8 1 3 2 6 7 7 2 0 3 7 3 1 9 5 7 2 9 8 2 1 1 5 9 6 1 5 4 4 2 6 4 0 7 8 7 9 5 0 4 4 3 6 5 3 3 1 0 0 0 6 7 7 2 5 3 5 8 1 1 3 2 8 2 6 1 0 1 3 8 1 2 9 3 8 4 0 8 4 7 1 1 9 8 9 4 6 9 0 6 1 2 2 1 1 7 1 2 3 3 1 4 6 8 1 4 2 8 4 5 2 8 7 3 1 4 6 9 3 8 4 3 2 9 9 3 5 0 3 6 9 5 5 5 2 0 1 5 3 3 8 6 6 1 0 1 1 5 6 1 2 0 9 0 0 5 1 8 4 1 7 3 5 5 5 6 9 7 6 9 6 5 0 0 2 5 3 2 8 3 6 3 8 0 4 0 8 1 9 4 3 9 9 2 8 5 0 0 6 4 9 9 6 3 9 2 4 6 3 0 8 2 6 3 3 5 4 7 3 3 6 5 7 9 2 9 9 1 8 5 5 3 2 9 8 0 4 4 0 8 9 2 3 4 5 0 2 4 5 2 5 3 2 7 8 7 6 9 3 8 1 0 6 6 3 6 1 4 5 6 4 7 7 0 2 6 4 2 9 8 0 6 6 7 7 5 5 4 4 6 0 0 6 2 4 7 9 4 8 9 3 8 4 0 7 9 9 4 2 6 9 5 5 3 9 7 3 2 3 0 2 1 6 9 9 8 5 6 8 9 7 9 6 5 4 3 3 7 0 3 9 9 4 3 7 9 6 8 8 5 5 6 3 3 2 3 9 6 9 6 7 3 4 4 8 0 3 2 9 8 0 1 5 9 6 0 5 0 3 8 6 8 7 5 5 8 2 7 6 7 6 3 6 0 5 1 3 6 8 0 3 7 2 1 2 7 4 5 3 5 4 0 0 4 6 2 3 6 0 0 1 7 8 6 3 2 6 0 8 7 1 1 5 4 8 6 5 5 0 1 6 6 4 3 1 5 7 5 6 7 8 0 2 2 1 7 3 6 3 6 7 3 7 6 2 5 4 9 7 5 7 2 1 0 6 6 7 6 9 1 1 4 0 3 6 7 8 3 5 2 3 5 3 7 8 6 4 1 1 4 4 4 9 6 5 1 5 9 2 5 2 2 2 8 5 4 6 6 5 3 0 8 7 2 1 1 5 9 3 2 2 0 3 1 8 1 0 7 6 1 4 1 8 6 7 3 3 7 8 6 0 3 7 3 0 5 3 1 2 7 5 6 3 1 4 7 8 7 2 5 2 3 7 4 2 2 6 0 1 7 2 9

 */