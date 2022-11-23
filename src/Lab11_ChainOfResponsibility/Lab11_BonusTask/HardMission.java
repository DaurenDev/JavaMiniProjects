package Lab11_ChainOfResponsibility.Lab11_BonusTask;

public class HardMission extends MissionProgress{
    public HardMission(int gameLevel) {
        super(gameLevel);
    }

    @Override
    public void write() {
        System.out.println("Hard Mission for destroying number of castles: FINISHED");
    }
}
