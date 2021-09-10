package pdd;

import java.util.Scanner;

public class HappyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = false;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            long c = (long )n*i;
            if(find(c)<2){
                System.out.println(c);
                flag = true;
                break;
            }



        }if(flag==false) System.out.println(-1);

    }public static int find(long c){
           String s = String.valueOf(c);
           int count =0;
           for(char a :s.toCharArray()){
               if(a!='0'&&a!='1') count++;
           }
           return count;
    }
}
