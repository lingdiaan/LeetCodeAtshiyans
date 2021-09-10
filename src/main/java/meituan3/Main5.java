package meituan3;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] score = scanner.nextLine().trim().split(" ");
        String fir = scanner.nextLine().trim();
        String sec = scanner.nextLine().trim();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < fir.length(); i++) {
            set1.add(fir.charAt(i));
        }
        for (int i = 0; i < sec.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if(set1.contains(sec.charAt(i))){
                sb.append(sec.charAt(i));
                set2.add(sec.charAt(i));
            }

        }
        for (int i = 0; i < fir.length(); i++) {
          StringBuilder sb2 = new StringBuilder();
          if(set2.contains(fir.charAt(i))){
              sb2.append(fir.charAt(i));
              set2.add(fir.charAt(i));
          }
        }


    }
}
