package JUC;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkjoinTest extends RecursiveTask<Long> {
    /*
    使用forkjoinpool
    2.forkjoinpoll.execute(forkjointask task);
    //forkjointask
    3.继承RecursiveTask
     */

    private  long start;
    private  long end;
    private  long temp=10000L;
    private long count=0L;




    public ForkjoinTest(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {

    }

    @Override
    protected Long compute() {
        if(end-start<temp){
            //分支合并
            long mid=(start+end)/2;
            ForkjoinTest task1 = new ForkjoinTest(start, mid);
            ForkjoinTest task2 = new ForkjoinTest(mid+1, end);
            task1.fork();//拆分任务，把任务压入线程队列
            task2.fork();
            long l = task1.join() + task2.join();
            return l;
        }else{
            for (long i = start; i <end ; i++) {
                count+=i;
            }
        }
        return count;
    }


}
