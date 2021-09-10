package Adapter;

//适配器
public class Adapter extends Adaptee implements Net2Usb {
    @Override
    public void handle(String request) {
        super.request();

    }

}
