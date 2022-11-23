package Lab11_ChainOfResponsibility.Lab11_BonusTask;

public class BossFight extends MissionProgress{
    public BossFight(int gameLevel) {
        super(gameLevel);
    }

    @Override
    public void write() {
        System.out.println("Boss has been beaten! Congratulations!");
    }
}
