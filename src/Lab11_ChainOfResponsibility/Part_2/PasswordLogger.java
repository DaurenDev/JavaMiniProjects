package Lab11_ChainOfResponsibility.Part_2;

public class PasswordLogger extends UserLogger{
    public PasswordLogger(int userLevel) {
        super(userLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Password authentication: " + message + ": SUCCEEDED");
    }
}
