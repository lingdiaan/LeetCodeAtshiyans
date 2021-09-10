package meituan0425;

import java.util.Scanner;

/**
 * 子串翻转
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int q = Integer.parseInt(scanner.nextLine());
        int[] l = new int[q];
        int[] r = new int[q];
        int[] op = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            op[i] = scanner.nextInt();
        }
        for (int i = q-1; i >=0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <s.length() ; j++) {
                if(j<l[i]-1||j>=r[i]) sb.append(s.charAt(j));
                else {
                    int c = (s.charAt(j) - 'a' + 26 - op[i]) % 26;
                    char ch = (char) (c+'a');
                    sb.append(ch);
                }
                }
            s=sb.toString();
            System.out.println(s);
            }
        System.out.println(s);
        }

    }

