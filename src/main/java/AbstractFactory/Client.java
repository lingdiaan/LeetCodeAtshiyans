package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct phone = xiaomiFactory.iphoneProduct();
        phone.start();

    }
}
