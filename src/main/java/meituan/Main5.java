package meituan;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main5 {

    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().trim().split(" ");

        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int a[][] = new int[n][n];


        for(int i=0;i<n;i++){

            str = reader.readLine().trim().split(" ");
            for(int j=0;j<n;j++){
                a[i][j] = Integer.parseInt(str[j]);
            }

        }
        int arr_1[][] = new int[n*n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int i1 = 0; i1 < n; i1++) {

                if(a[i][i1]==1){
                    arr_1[index][0] = i;
                    arr_1[index][1] = i1;
                    index++;
                }

            }
        }

        for(int i=0;i<index;i++){
            f(arr_1[i][0],arr_1[i][1],a,2,n,k,0);
        }

        if(result==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);



    }

    public static void f(int x,int y,int[][] a,int level,int n,int k,int sum){

        if(level==k+1){
            if(sum<result){
                result = sum;
            }
            return ;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j]==level){
                    sum = sum + Math.abs(i-x)+Math.abs(j-y);
                    f(i,j,a,level+1,n,k,sum);
                    sum = sum - Math.abs(i-x)+Math.abs(j-y);
                }
            }
        }

    }


}
