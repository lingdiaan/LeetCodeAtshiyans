package pdd;

import java.util.List;
import java.util.Scanner;

public class NumOf0 {

    private static long pri[];
    private static long sumx[];
    private static int index=0;
    public static void main(String[] args) {
        pri=new long[10001];
        sumx=new long[10001];
        long maxn= (long) (1e18+1);
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextInt();
//        int count = 0;
//        while(n!=0){
//            count+=(n/5);
//            n=n/5;
//        }
//        System.out.println(count);
//        System.out.println(n);
        long m = scanner.nextInt();
        int count = 0;
//        List<Long> nums = find(m);
        while(n!=0){
            count+=(n/m);
            n=n/m;
        }
        System.out.println(count*3);
        System.out.println(n);
        long ans=maxn;

        getpri(m);
        for(int i=0;i<index;i++) ans=Math.min(ans,getsumX(n,pri[i])/sumx[i]);


    }
//    public static List<Long> find(Long m){
//
//    }

    static void getpri(long m)//分解质因数
    {
        for(long i=2;i*i<=m;i++)
        {
            while(m%i==0)
            {
                pri[index]=i;
                sumx[index]++;
                m/=i;
            }
            if(sumx[index]!=0) index++;
        }
        if(m>1){ pri[index]=m;sumx[index++]=1;}
    }

    static long getsumX(long n,long p)//n！能分解出sumX个p
    {
        long sumX=0;
        while(n>0)
        {
            sumX+=n/p;
            n/=p;
        }
        return sumX;
    }



}
