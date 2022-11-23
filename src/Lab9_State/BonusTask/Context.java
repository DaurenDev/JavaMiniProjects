package Lab9_State.BonusTask;

public class Context {
    ParticipantState state;

    public Context(ParticipantState state){
        this.state = state;
    }

    public void getReady(){
        this.state.getReady(this);
    }

    public void delay(){
        this.state.delayStatus(this);
    }
}
