package Single;

public class Holder {
    private Holder(){

    }
    public static Holder getInstance(){
        return  innerClass.HOLDER;
    }
    //静态内部类实现
    static class innerClass{
private static final Holder HOLDER = new Holder();
    }
}
