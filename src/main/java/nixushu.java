import java.util.*;
public class nixushu {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=100;i*4<n;i++){
            long b = i*4;
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            String c = String.valueOf(i);
            if(c.length()!=sb.length())
                continue;
            if(sb.reverse().toString().equals(c)){list.add(Integer.parseInt(c));list.add(Integer.parseInt(sb.reverse().toString()));
            }

        }
        int i=0;
        System.out.println((list.size()+1)/2);
        while(i<list.size()){
            System.out.println(list.get(i)+" "+list.get(i+1));
            i+=2;
        }
    }
}