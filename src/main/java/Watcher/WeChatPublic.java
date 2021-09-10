package Watcher;

import java.util.LinkedList;
import java.util.List;

public class WeChatPublic implements Subject{
    List<Observer> userlist = new LinkedList<>();
    @Override
    public void attach(Observer o) {
        userlist.add(o);
    }

    @Override
    public void detach(Observer o) {
userlist.remove(o);
    }

    @Override
    public void sendMSG(String msg) {
        for(Observer o : userlist)
            o.update(msg);
    }
}
