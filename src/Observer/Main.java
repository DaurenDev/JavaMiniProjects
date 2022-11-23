package Observer;

public class Main {
    public static void main(String[] args) {
        Observer user1 = new ConcreteObserver("Abylai Aidarov"),
                 user2 = new ConcreteObserver("Aibol Otar"),
                 user3 = new ConcreteObserver("Aktorgyn Nassyrov");

        Subject news = new Publisher();
        news.addSubscriber(user1);
        news.addSubscriber(user2);
        news.addSubscriber(user3);

        news.sendMessage("IITU IS THE BEST");

        news.removeSubscriber(user2);

        news.notifyAllSubscribers();
    }
}

