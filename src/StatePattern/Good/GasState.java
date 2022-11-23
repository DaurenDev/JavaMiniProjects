package StatePattern.Good;

public class GasState implements State {
    @Override
    public void heat(GoodContext context) {
        System.out.println("GasState: heat \t >>> GAS <<< ");
    }

    @Override
    public void frost(GoodContext context) {
        System.out.println("GasState: frost \t GAS -> LIQUID ");
        context.type = new LiquidState();
    }
}


