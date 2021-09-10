package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumTest {
    INSTANCE;
    public EnumTest getInstance(){
        return INSTANCE;
    }


}
class  Test1{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumTest e = EnumTest.INSTANCE;
        Constructor<EnumTest> a = EnumTest.class.getDeclaredConstructor(String.class,int.class);
        a.setAccessible(true);
        EnumTest c = a.newInstance();
        System.out.println(c==e);
    }
}