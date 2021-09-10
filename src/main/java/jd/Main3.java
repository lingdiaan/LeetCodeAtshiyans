package jd;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().trim().split(" ");
        int n = Integer.parseInt(str[0]);
        str = reader.readLine().trim().split(" ");
        int[] input = new int[n];
        for (int i = 0; i <n ; i++) {
            input[i]=Integer.parseInt(str[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(input[i])){
                int val = map.get(input[i])+1;
                map.put(input[i],val);
            }else map.put(input[i],0);
        }
        int result = 0;
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            if(entry.getValue()>result){
                result = entry.getValue();
            }
        }
        System.out.println(result);
    }
}
