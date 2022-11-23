package Lab11_ChainOfResponsibility.Lab11_BonusTask;

public class SimpleMission extends MissionProgress{
    public SimpleMission(int gameLevel) {
        super(gameLevel);
    }

    @Override
    public void write() {
        System.out.println("Simple Mission for destroying number of castles: FINISHED");
    }
}
