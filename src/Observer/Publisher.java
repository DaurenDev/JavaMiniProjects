package Observer;

import java.util.ArrayList;
import java.util.List;


public class Publisher implements Subject{
    List<Observer> list = new ArrayList<>();
    String msg = "empty";

    @Override
    public void addSubscriber(Observer o) {
        System.out.println("\t ---added the new user: " + o.userName);
        list.add(o);
    }

    @Override
    public void removeSubscriber(Observer o) {
        System.out.println("\t ---removed the user: " + o.userName);
        int index = list.indexOf(o);
        if(index >= 0) list.remove(index);
    }

    @Override
    public void notifyAllSubscribers() {
        System.out.println("\n \t ---NOTIFICATION: ");
        for(Observer item : list)
            item.print(this.msg);
        System.out.println("\n");
    }

    @Override
    public void sendMessage(String msg) {
        this.msg =  msg;
        notifyAllSubscribers();
    }
}