package Observer;

public class ConcreteObserver extends Observer{
    public ConcreteObserver(String name) { // <--
        this.userName = name;
    }
    @Override
    void print(String msg) {
        System.out.println(this.userName + ": " + msg);
    }
}
