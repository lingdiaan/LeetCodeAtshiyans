package xiecheng;

import java.util.*;

/**
 * 第二题
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().trim().split(",");
        String[] zhongjiang = scanner.nextLine().trim().split(",");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < zhongjiang.length; i++) {
            set.add(Integer.parseInt(zhongjiang[i]));
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(Integer.parseInt(nums[i]))) {
                List<Integer> list = map.getOrDefault(Integer.parseInt(nums[i]) , new ArrayList<Integer>());
                list.add(i);
                map.put(Integer.parseInt(nums[i]),list);
            }
        }
        int ans = Integer.MAX_VALUE;
        int ansi = 0;
        while(map.size()==zhongjiang.length) {
            int min = Integer.MAX_VALUE;
            int mini = -1;
            int max = 0;
            for (int i = 0; i < zhongjiang.length; i++) {
                List<Integer> list = map.get(Integer.parseInt(zhongjiang[i]));
                int get = list.get(0);
                if(get<min){
                    min = get;
                    mini = i;
                }
                if(get>max){
                    max = get;
                }
            }
            if(max-min<ans){
                ans = max-min;
                ansi = min;
            }
            List<Integer>list = map.get(Integer.parseInt(zhongjiang[mini]));
            list.remove(0);
            if(list.size()==0)
                break;
            map.put(Integer.parseInt(zhongjiang[mini]),list);

        }
        System.out.println(ansi+1);

    }
}
/*
1,2,5,4,3,4,7,1,4,9,3,1
3,4,1
 */