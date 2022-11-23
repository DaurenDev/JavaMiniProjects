package Lab9_State.BonusTask;

public class NotReadyState implements ParticipantState{
    @Override
    public void getReady(Context context) {
        System.out.print("I'm ready!");
        context.state = new ReadyState();
    }

    @Override
    public void delayStatus(Context context) {
        System.out.print("I'm not ready!");
    }
}
