package Single;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Paixu {
    private volatile static Paixu aPaixu;
    private static Paixu getInstance(){
        if(aPaixu ==null){
            synchronized (Paixu.class){
                if (aPaixu ==null){
                    aPaixu =new Paixu();
                }
            }
        }
        return aPaixu;
    }

    public static void main(String[] args) {
//        Paixu doublee = Paixu.getInstance();
//        Paixu doubleee = Paixu.getInstance();
//        System.out.println(doublee.equals(doubleee));
//        System.out.println(doublee.hashCode());
//        System.out.println(doubleee.hashCode());
        int[] a = new int[]{5,7,6,4,5,2,1,3,7,9,};
//        digui(a,0,a.length-1);
//        HeadOrder(a);
        digui(a,0,a.length-1);
        for(int i:a) System.out.print(i+",");
    }

//    public static void digui(int[] arr,int start ,int end){
//        if (start < end) {
//            int stard = arr[start];
//            //记录需要进行排序的下标
//            int low = start;
//            int high = end;
//            while (low < high) {
//                while (low < high && stard <= arr[high]) {
//                    high--;
//                }
//                arr[low] = arr[high];
//                while (low < high && arr[low] <= stard) {
//                    low++;
//                }
//                arr[high] = arr[low];
//            }
//            arr[low] = stard;
//            digui(arr, start, low);
//            digui(arr, low + 1, end);
//        }
//    }
    public static void digui(int[] arr,int start,int end){
        if(start<end){
        int low = start;
        int hi = end;
        int a = arr[start];
        while(low<hi){
            while(hi>low&&arr[hi]>=a)
                hi--;
            arr[low]=arr[hi];
            while(hi>low&&arr[low]<=a)
                low++;
            arr[hi]=arr[low];
        }arr[low]=a;
        digui(arr,start,low);
        digui(arr,low+1,end);
    }}

    public static void HeadOrder(int[] nums){
        for(int i=nums.length/2-1;i>=0;i--)
adjustHeap(nums,i,nums.length);
for(int i=nums.length-1;i>0;i--){
    swap(nums,0,i);
    adjustHeap(nums,0,i);
}




    }
    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
//    public static void adjustHeap(int[] arr,int i,int length){
//        int temp = arr[i];
//        for(int k=i*2+1;k<length;k=k*2+1){
//            if(k+1<length&&arr[k+1]>arr[k])
//                k++;
//            if(arr[k]>temp){
//                arr[i]=arr[k];
//                i=k;
//            }else break;
//
//        }arr[i]=temp;
//    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }




}
