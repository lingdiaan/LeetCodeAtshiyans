package ByteDance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] songshu = new int[n];
        int sum = 0;
        int l = -1,r=-1;
        int lmax=-1,rmax=-1;
        for (int i = 0; i < n; i++) {
            songshu[i]=scanner.nextInt();
            sum+=songshu[i];
        }
        int avg = sum/n;
        for (int i = 0; i < n; i++) {
            if(songshu[i]<avg){
                if(l==-1)l=i;
                r=i;
            }
            if(songshu[i]>avg){
                if(lmax==-1)lmax=i;
                rmax=i;
            }
        }
        int ans = 0;
        if(lmax==rmax){
            if(l==r){
                ans=Math.abs(ans-l);
            }else if(lmax>l&&lmax<r) ans = r-l;
            else if(lmax>r) ans = lmax-l;
            else if(lmax<l) ans = r-lmax;
        }
        else
        {
            if(lmax>l) {
            int count = songshu[l];
            int num = 1;
            while (count != num * avg) {
                count += songshu[l + num++];
            }
            ans+=num;
        }
            if(lmax<l) {
                int count = songshu[lmax];
                int num = 1;
                while (count != num * avg) {
                    count += songshu[lmax + num++];
                }
                ans+=num;
            }
        if(rmax<r){
            int count=songshu[r];
            int num=1;
            while(count!=num*avg){
                count+=songshu[r+num++];
            }
            ans+=num;}
        if(rmax>r){
            int count=songshu[rmax];
            int num=1;
            while(count!=num*avg){
                count+=songshu[rmax+num++];
            }
            ans+=num;
        }


        }

        System.out.println(ans);
    }

}
