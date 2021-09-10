package JUC.Interfase;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p = new Predicate<String>() {
            @Override
            //判断字符串是否为空
            public boolean test(String o) {
               return o.isEmpty();
            }
        };
        System.out.println(p.test(""));
    }
}
