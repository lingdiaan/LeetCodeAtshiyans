import  java.util.*;
public class FlowerNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            boolean flag = true;
            for(;start<end;start++){
                int a = start;
                int b = (int)Math.pow(a%10,3);
                int c = (int)Math.pow((a/10)%10,3);
                int d = (int)Math.pow(a/100,3);
                if(b+c+d==start){
                    System.out.println(start);
                    flag = false;
            }
                }
            if(flag==true)
                System.out.println("no");

        }

    }
}
