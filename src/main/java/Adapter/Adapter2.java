package Adapter;

public class Adapter2 implements Net2Usb{
    Adaptee adaptee ;
    @Override
    public void handle(String request) {
        adaptee.request();
    }

//    public void setAdaptee(Adaptee adaptee) {
//        this.adaptee = adaptee;
//    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
