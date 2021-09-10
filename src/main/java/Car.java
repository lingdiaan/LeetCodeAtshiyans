import java.util.*;
public class Car {
    private static int[][] a1;
    private static int count;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a1 = new int[n][2];

        for(int i=0;i<n;i++){
            a1[i][0] = scanner.nextInt();
            a1[i][1] = scanner.nextInt();
        }
        Arrays.sort(a1,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        digui(0,0,a,b);
        System.out.println(count);

    }public static void digui(int i,int counts,int a,int b){
        if(i==a1.length||(a==0&&b==0)){
            count=Math.max(count,counts);
            return;
        }
        System.out.println("i="+i+"    count="+counts+"   a[i]="+a1[i][0]+" "+a1[i][1]);
        if(a>0)
            digui(i+1,counts+a1[i][0],a-1,b);
        if(b>0)
        digui(i+1,counts+a1[i][1],a,b-1);
        digui(i+1,counts,a,b);
    }

}
