package meituan2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                String temp = s.substring(i,j+1);
                HashMap<Character,Integer> map = new HashMap<>();
                for (int k = 0; k < temp.length(); k++) {
                    int len = map.getOrDefault(temp.charAt(k),0)+1;
                    if(len>temp.length()/2) {
                        ans++;
                        break;

                    }
                    map.put(s.charAt(k),len);

                }
            }
        }
        System.out.println(ans+n);
    }
}
