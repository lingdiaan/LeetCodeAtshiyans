package Adapter;

//客户端类，向上网，插不上网线
public class Computer {

    public void net(Net2Usb net2Usb){
        net2Usb.handle("");

    }
}
