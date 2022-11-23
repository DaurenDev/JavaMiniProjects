package AbstractFactory.Action;

public class RunAction implements Action {
    @Override
    public void move() {
        System.out.println("Action: Run");
    }
}
