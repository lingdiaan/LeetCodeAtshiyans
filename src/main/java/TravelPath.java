import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class TravelPath {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine());
        int count = 0;
        for(int i=0;i<n;i++){
            String cin_str= bf.readLine();
            String[] path=cin_str.split(" ");
            if(set.size()==0){
                set.add(path[0]);
            }
            if(set.contains(path[1])){
                count++;
                set=new HashSet<>();
            }else{
                set.add(path[1]);
            }
        }
        System.out.println(count);

    }
}

/*
6
beijing nanjing
nanjing guangzhou
guangzhou shanghai
shanghai beijing
fuzhou beijing
beijing fuzhou
 */