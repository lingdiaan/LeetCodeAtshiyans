package baidu;

import java.util.Scanner;

public class Main3 {
    private static int ans;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int op = scanner.nextInt();
        for(int i=0;i<s1.length()-1;i++){
                dfs(s1,s2,op,i);
        }System.out.println(ans);
    }
    public static void dfs(String a,String b,int op,int start){
        String c = a.substring(start+1,a.length())+a.substring(0,start+1);
        op--;
        if(op==0&&c.equals(b)) {ans++;
            System.out.println(a);
            return;
            }
        else if(c.equals(b)&&op%2==0){ans++;return;}
        else if(op==0) return;
        else{
            for (int i = 0; i < c.length()-1; i++) {
                    dfs(c,b,op,i);
            }
        }
    }
}
