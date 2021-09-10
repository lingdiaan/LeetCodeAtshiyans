package JUC;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ForkTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test1(0L,10_0000_00000L);
        test2(0L,10_0000_00000L);
        test3(0L,10_0000_00000L);
    }
    public static void test1(long start,long end){//242
        long startTime = System.currentTimeMillis();
        long sum=0L;
        for (long i = start; i < end; i++) {
            sum+=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"sum:"+sum);
    }

    public static void test2(long start,long end) throws ExecutionException, InterruptedException {//2
        long startTime = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> forkjoinTest = new ForkjoinTest(start, end);
        ForkJoinTask<Long> submit = forkJoinPool.submit(forkjoinTest);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"sum:"+submit.get());
    }

    public static void test3(long start,long end){
        long startTime = System.currentTimeMillis();
        LongStream.rangeClosed(start,end).parallel().reduce(0,Long::sum);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
