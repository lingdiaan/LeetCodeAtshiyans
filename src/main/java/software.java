import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class software {
    public static void main(String[] args) {
        System.out.println(find2(17));

    }
    public static int solution(int A[]){
        if(A==null||A.length==0)
            return 0;
        boolean up = true;
        boolean start = false;
        int ans = 1;
        for(int i=1;i<A.length;i++){
            if(start==false){
                if(A[i]>A[i-1]){
                    up = true;
                    ans++;
                    start=true;
                }else if(A[i]<A[i-1]){
                    up=false;
                    ans++;
                    start=true;
                }
            }
            else{
                if(A[i]>A[i-1]&&up==false){
                    ans++;
                    up=true;
                }else if(A[i]<A[i-1]&&up==true){
                    ans++;
                    up=false;
                }

            }
        }
        return ans;
    }
    public static int find2(int n){
        int ans = 0;
        while(n!=0) {
            if ((n&1) == 1)
                ans++;
                n=n>>1;

        }
        return ans;
    }
    public static int solution(Tree T){
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        postorder(T,set,0);
        return max;


    }
    private static   int max = 0;

    public static void postorder(Tree root,Set<Integer> set,int ans) {
        if (root == null||set.contains(root.x)) {
            max = Math.max(ans,max);
            return;
        }
        set.add(root.x);
        postorder(root.l, set,ans+1);
        postorder(root.r, set,ans+1);

    }


}
class Tree{
    public int x;
    public Tree l;
    public Tree r;

}
