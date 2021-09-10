import java.util.concurrent.ConcurrentHashMap;

public class Student{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student 被回收了");
    }


    public static void main(String[] args) {
        Student student = new Student();
//        student = null;
//        System.gc();
//        System.out.println(student instanceof User);
        Integer a=100 ;Integer b=100;
        System.out.println(a==b);
        Integer c=1000;Integer d=1000;
        System.out.println(c==d);

    }
}