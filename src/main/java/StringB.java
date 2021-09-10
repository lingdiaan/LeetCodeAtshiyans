import java.util.*;
public class StringB {
    public static void main(String[] args) {
        String s = new StringB().compress("[14|FSFVSW]FSFA[3|SDFSF[8|SFSF]FSF]");
        System.out.println("ans="+s);
    }
    public String compress (String str) {
        // write code here
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            if(str.charAt(i)==']'){
                StringBuilder sb = new StringBuilder();
                while(!s.isEmpty()&&!isNum(s.peek())){
                    sb.append(s.pop());
                }int count=0;
                StringBuilder nums = new StringBuilder();
                while(!s.isEmpty()&&isNum(s.peek())){
                    nums.append(s.pop());
                }
                if(nums.length()>0)
                count = Integer.parseInt(nums.reverse().toString());
                if(count==0&&s.isEmpty()) return sb.reverse().toString();
                StringBuilder sb2 = new StringBuilder();
                while(count!=0){
                    sb2.append(sb);
                    count--;
                }



                String s2 = sb2.reverse().toString();
                System.out.println(s2);
                for(int j=0;j<s2.length();j++){
                    s.push(s2.charAt(j));

                }
                System.out.println(s.size());


            }else if(str.charAt(i)=='['||str.charAt(i)=='|') continue;
            else s.push(str.charAt(i));
        }
            StringBuilder sb = new StringBuilder();
        System.out.println(s.size());
            while(!s.isEmpty()) {
                System.out.print(s.peek());sb.append(s.pop());}
        System.out.println("sb=="+sb.toString());
            return sb.reverse().toString();



    } public  boolean isNum(char s){
        if(s>='0'&&s<='9')
            return true;
        else return false;
    }
}

