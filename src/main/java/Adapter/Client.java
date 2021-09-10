package Adapter;

public class Client {
    public static void main(String[] args) {
        Computer c = new Computer();
        Net2Usb net2Usb = new Adapter();
        Adaptee adaptee = new Adaptee();
//        c.net(net2Usb);
        Adapter2 adapter2 = new Adapter2(adaptee);

        c.net(adapter2);

    }
}
