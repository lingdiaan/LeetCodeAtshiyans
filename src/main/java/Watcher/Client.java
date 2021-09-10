package Watcher;

public class Client {
    public static void main(String[] args) {
        WeChatUser w1 = new WeChatUser("李李李");
        WeChatUser w2 = new WeChatUser("杰杰杰");
        WeChatUser w3 = new WeChatUser("哈哈哈");

        WeChatPublic gong = new WeChatPublic();
        gong.attach(w1);
        gong.attach(w2);
        gong.attach(w3);
        gong.sendMSG("出来开会了");
    }
}
