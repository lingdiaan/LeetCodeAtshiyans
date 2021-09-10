package JUC.Interfase;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> s =()->{
            System.out.println("get");return "哈哈哈";};
        System.out.println(s.get());
    }

}
