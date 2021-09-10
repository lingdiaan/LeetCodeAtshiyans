package beike;

import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(a);
            sum+=a;
        }
        for (int i = 0; i < q; i++) {
            int op = scanner.nextInt();
            System.out.println(digui(op, list, sum, 1,q) || digui(op, list, sum, 2,q));;
        }


    }
    public static boolean digui(int q,List<Integer> list,int sum,int moth,int time){
        if(sum==time) return true;
        int avg = sum/list.size();
        if(q==0) return false;
        List<Integer> list12;
        switch (moth){
            case 1:
list12 = new ArrayList<>();
                for (int i : list) {
                    if(i<=avg) {
                        sum-=i;
                        list12.add(i);

                    }
                    }
                for (int i :list12) {
                    list.remove(i);
                }

                return digui(q-1,list,sum,1,time)||digui(q-1,list,sum,2,time);

            case 2:
list12 = new ArrayList<>();
                for (int i : list) {
                    if(i>avg) {
                        sum-=i;
                        list12.add(i);

                    }
                }
                for (int i :list12) {
                    list.remove(i);
                }

                return digui(q-1,list,sum,1,time)||digui(q-1,list,sum,2,time);


        }
        return true;
        }
    }

