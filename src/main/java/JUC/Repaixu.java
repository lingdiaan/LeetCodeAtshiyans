package JUC;

public class Repaixu {
    int a;
    volatile int v1 = 1;
    volatile int v2 = 2;

    public static void main(String[] args) {
       new Repaixu().readAndWrite();
    }


    void readAndWrite() {
        int i = v1;           //第一个volatile读
        int j = v2;           // 第二个volatile读
        a = i + j;            //普通写
        v1 = i + 1;          // 第一个volatile写
        v2 = j * 2;          //第二个 volatile写
    }

}
