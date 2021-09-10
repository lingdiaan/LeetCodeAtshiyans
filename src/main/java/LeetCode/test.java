package LeetCode;

import com.sun.glass.ui.Pixels;
import com.sun.glass.ui.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.io.*;

public class test {

    private static Map<Integer,List<Integer>> path;
    private static Map<Integer,Integer> weigh;
    private static boolean[] visited;
    static int[] childNum;      // 存储以节点i为根的树有多少个节点
    static int[] max, min;
    // 节点间的最大差值
    static int maxDiff = -1;
    // 待求节点
    static int node = -1;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nodeNum = scanner.nextInt();
        int k = scanner.nextInt();
        weigh = new HashMap<>();
        for(int i=0;i<nodeNum;i++)
            weigh.put(i+1,scanner.nextInt());
        path = new HashMap<>();


        for(int i=0;i<nodeNum-1;i++){
            int father = scanner.nextInt();
            int son = scanner.nextInt();
            List<Integer> fatherList = path.getOrDefault(father,new ArrayList<Integer>());
            List<Integer> sonList =path.getOrDefault(son,new ArrayList<Integer>());
            fatherList.add(son);
            sonList.add(father);
            path.put(father,fatherList);
            path.put(son,sonList);
        }
        int root = scanner.nextInt();
        creatTree(root);

                visited = new boolean[nodeNum + 1];
        max = new int[nodeNum + 1];
        min = new int[nodeNum + 1];
        childNum = new int[nodeNum + 1];
        dfs(root,k);
        System.out.println(node);


    }


    private static void dfs(int parent, int k) {
        visited[parent] = true;
        // 初始化parent下的最值为parent的节点权重
        max[parent] = weigh.get(parent);
        min[parent] = weigh.get(parent);
        childNum[parent]=1;
        for(int i=0;i<path.get(parent).size();i++){
            int child = path.get(parent).get(i);
            if(!visited[child]){

                dfs(child,k);
                max[parent]=Math.max(max[parent],max[child]);
                min[parent]=Math.min(min[parent],min[child]);
                childNum[parent]+=childNum[child];
            }
        }
        if(childNum[parent]<=k&&max[parent]-min[parent]>=maxDiff){
            if(max[parent]-min[parent]>maxDiff){
                node=parent;
                maxDiff=max[parent]-min[parent];
            }else{
                node=node==-1?node:Math.min(node,parent);
            }
        }

//        // 初始情况下，该子树只有一个节点
//        childNum[parent] = 1;
//        for(int i = 0; i < path.get(parent).size(); i++){
//            int child = path.get(parent).get(i);
//            if(!visited[child]){
//                // 没访问过这个孩子节点就进行深搜
//                dfs(child, k);
//                max[parent] = Math.max(max[parent], max[child]);
//                min[parent] = Math.min(min[parent], min[child]);
//                childNum[parent] += childNum[child];
//            }
//        }
//        if(childNum[parent] <= k && max[parent] - min[parent] >= maxDiff){
//            // 以parent为根节点的子树满足节点数小于等于k，且最大差值大于等于目前最大
//            if(max[parent] - min[parent] > maxDiff){
//                // 大于了直接更新，等于的话需要考虑哪个根节点的编号小
//                node = parent;
//                maxDiff = max[parent] - min[parent];
//            }else{
//                // 如果node还没有赋值，就直接赋值为当前节点，否则取满足要求的节点中编号最小的
//                node = node == -1? parent: Math.min(node, parent);
//            }
//        }
    }



    public static void  creatTree(Integer root){
        List<Integer> fatherList =  path.get(root);
        if(fatherList.size()==0){
            return;//递归的终点
        }
        for(Integer child:fatherList){
            List<Integer> children = path.get(child);
            children.remove(root);
            //删除child为键的 邻接数组里面是root的部分
            path.put(child,children);
            creatTree(child);
        }
    }

}