package honer;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] test = scanner.nextLine().trim().split(" ");
        String[] student = scanner.nextLine().trim().split(" ");
        LinkedList<String> list = new LinkedList<>();
        for(String s:test) list.add(s);
        int score = test.length;
        int i=0,j=0;
        while(i<test.length&&j<student.length){
            if(test[i].equals(student[j])){
                list.remove(test[i]);
                i++;
                j++;
                continue;
            }
            else if(canRep(test[i],student[j] )){
                list.remove(test[i]);
                score--;
                i++;j++;
                continue;
            }
            else if(!canRep(test[i],student[j])){
                //多单词
                if(!list.contains(student[j])){

                    j++;
                    score--;
                    continue;
                }
                //缺单词
                else {
                    list.remove(test[i]);
                    i++;
                    score-=2;
                    continue;
                }
            }
        }
        if(j!=student.length) score-=student.length-j;
        System.out.println(score-2*list.size());
    }
    public static boolean canRep(String s1,String s2){
        if(s1.length()>2*s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if(list.contains(b[i])) count++;
        }
        if(count>a.length/2) return true;
        else return false;
    }
}
