package StatePattern.Good;

public class SolidState implements State{
    @Override
    public void heat(GoodContext context) {
        System.out.println("SolidState: heat \t SOLID -> LIQUID");
        context.type = new LiquidState();
    }

    @Override
    public void frost(GoodContext context) {
        System.out.println("SolidState: heat \t >>> SOLID <<< ");
    }
}
