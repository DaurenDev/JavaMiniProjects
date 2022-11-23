package StatePattern.Good;

public class LiquidState implements State {
    @Override
    public void heat(GoodContext context) {
        System.out.println("LiquidState: heat \t LIQUID -> GAS");
        context.type = new GasState();
    }

    @Override
    public void frost(GoodContext context) {
        System.out.println("LiquidState: heat \t LIQUID -> SOLID");
        context.type = new SolidState();
    }
}
