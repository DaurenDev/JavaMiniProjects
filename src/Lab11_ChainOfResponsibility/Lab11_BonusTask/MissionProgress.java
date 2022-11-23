package Lab11_ChainOfResponsibility.Lab11_BonusTask;

public abstract class MissionProgress {
    private int gameLevel;
    private MissionProgress missionProgress;

    public MissionProgress(int gameLevel){
        this.gameLevel = gameLevel;
    }

    public void setMissionProgress(MissionProgress missionProgress){
        this.missionProgress = missionProgress;
    }

    public void showProgress(int level){
        if(level >= gameLevel){
            write();
        }
        if(missionProgress != null){
            missionProgress.showProgress(level);
        }
    }

    public abstract void write();
}
