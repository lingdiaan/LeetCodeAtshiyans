package albb;

import java.util.*;

/**
 * 第一题
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[][] stu = new int[n][2];

            for (int j = 0; j < n; j++) {
                stu[j][0] = scanner.nextInt();
                stu[j][1]= scanner.nextInt();

            }
//            Arrays.sort(stu, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    return o1[0]-o2[0];
//                }
//            });
            List<Integer> ans = new ArrayList<>();
            int k=0;
            for(int j=1;k<n;j++){
                if(j<stu[k][0]) continue;
                else if(j<=stu[k][1]+stu[k][0]-1) {ans.add(j);k++;}
                else if(j>stu[k][0]+stu[k][1]-1) {j--;k++;ans.add(0);}

            }
            for (int j=0;j<ans.size()-1;j++) {
                System.out.print(ans.get(j)+" ");
            }
            System.out.println(ans.get(ans.size()-1));
        }

    }
}
