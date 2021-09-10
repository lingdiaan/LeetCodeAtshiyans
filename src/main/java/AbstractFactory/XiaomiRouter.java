package AbstractFactory;

public class XiaomiRouter implements RouteProduct{
    @Override
    public void start() {
        System.out.println("打开小米路由");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由");
    }

    @Override
    public void openWIFI() {
        System.out.println("打开小米WIFI");
    }

    @Override
    public void setting() {
        System.out.println("设置小米密码");
    }
}
