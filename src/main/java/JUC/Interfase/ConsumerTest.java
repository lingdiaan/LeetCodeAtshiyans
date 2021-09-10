package JUC.Interfase;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c = (str)->{
            System.out.println(str);
        };
        c.accept("哈哈哈哈");
    }
}
