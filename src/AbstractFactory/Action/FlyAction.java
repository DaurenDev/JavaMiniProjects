package AbstractFactory.Action;

public class FlyAction implements Action{
    @Override
    public void move() {
        System.out.println("Action: fly");
    }
}
