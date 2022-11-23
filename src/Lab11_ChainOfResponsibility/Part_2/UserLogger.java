package Lab11_ChainOfResponsibility.Part_2;

public abstract class UserLogger {
    private int userLevel;
    private UserLogger nextUserLogger;

    public UserLogger(int userLevel){
        this.userLevel = userLevel;
    }

    public void setNextUserLogger(UserLogger nextUserLogger){
        this.nextUserLogger = nextUserLogger;
    }

    public void sendNotification(String message, int level){
        if(level == userLevel){
            write(message);
        }
        if(nextUserLogger != null){
            nextUserLogger.sendNotification(message, level);
        }
    }

    public abstract void write(String message);

}
