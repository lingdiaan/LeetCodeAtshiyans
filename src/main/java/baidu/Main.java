package baidu;

import jdk.internal.org.objectweb.asm.Handle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int n = scanner.nextInt();
        int n =Integer.parseInt(bf.readLine().trim());
        for (int i = 0; i < n; i++) {
//            int a = scanner.nextInt();

//            int b = scanner.nextInt();
            String[] num = bf.readLine().trim().split(" ");
            int a=Integer.parseInt(num[0]);
            int b=Integer.parseInt(num[1]);
            int end=1;
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            int aStep=0;
            int bStep=0;
            while(a>=end||b>=end){
                if(a>=1){

                if(!map.containsKey(a)) map.put(a,aStep++);
                else{
                    System.out.println(map.get(a)+aStep);
                    break;
                }
                a>>=1;
                }
                if(b>=1){
                    if(!map.containsKey(b)) map.put(b,bStep++);
                    else{
                        System.out.println(map.get(b)+bStep);
                        break;
                    } b>>=1;
                }
            }
        }
    }
}
