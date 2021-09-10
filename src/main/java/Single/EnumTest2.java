package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumTest2 {
    INSTANCE;
    public EnumTest2 getInstance(){return INSTANCE;}
}

class Testx{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor c =  EnumTest2.class.getDeclaredConstructor(String.class,int.class);
        c.setAccessible(true);
        EnumTest2 e = (EnumTest2) c.newInstance();
    }
}