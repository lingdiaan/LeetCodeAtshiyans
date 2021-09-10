package AbstractFactory;

public class HUAWEIPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为发短信");
    }
}
