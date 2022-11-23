package Lab9_State.BonusTask;

public class ReadyState implements ParticipantState {
    @Override
    public void getReady(Context context) {
        System.out.print("I'm ready!");
    }

    @Override
    public void delayStatus(Context context) {
        System.out.print("I'm not ready!");
        context.state = new NotReadyState();
    }
}
