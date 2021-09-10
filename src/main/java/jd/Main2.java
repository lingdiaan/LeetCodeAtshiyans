package jd;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int[] nums = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for (int i=0;i<n;i++){
            if(left.size()!=0&&left.peek()==nums[i]) {
                ans++;
                map.put(nums[i],map.get(nums[i])-1);
            }
            else if(right.size()!=0&&right.peek()==nums[i]) {
                ans++;
                map.put(nums[i],map.get(nums[i])-1);
            }
            else if(left.isEmpty()) {
                left.add(nums[i]);
                map.put(nums[i],map.get(nums[i])-1);
            }
            else if(right.isEmpty()) {
                right.add(nums[i]);
                map.put(nums[i],map.get(nums[i])-1);
            }
            else if(map.get(left.peek())<=map.get(right.peek())){left.add(nums[i]);}
            else if(map.get(right.peek())<map.get(left.peek())){right.add(nums[i]);}
        }
        System.out.println(ans);
    }
}
