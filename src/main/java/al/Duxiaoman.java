package al;

import java.util.*;

public class Duxiaoman {

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine().trim();
            ArrayList<String> list = new ArrayList<>();
            boolean flag = false;
            for (int j = 0; j < s.length(); j+=3) {
                String a = s.substring(j,j+3);
                list.add(a);
                if(compare(list,a)){
                    System.out.println("No");
                    flag = true;
                    break;
                }

            }
            if(flag==true) continue;
            System.out.println("Yes");
        }

    }

    public static boolean compare(List<String> ss,String s){

        for(String sa:ss) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (sa.charAt(i) != s.charAt(i))
                    count++;
                if (count == 2) return true;
            }
        }
        return false;
    }

}
