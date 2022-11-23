package Observer;

public interface Subject {
    void addSubscriber(Observer o);
    void removeSubscriber(Observer o);
    void notifyAllSubscribers();
    void sendMessage(String msg);
}
