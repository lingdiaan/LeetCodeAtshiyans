package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }


}
class  Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingle e = EnumSingle.INSTANCE;
        Constructor<EnumSingle> a = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        a.setAccessible(true);
        EnumSingle c = a.newInstance();
        System.out.println(c==e);
    }
}
