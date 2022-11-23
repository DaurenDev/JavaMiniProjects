package Lab11_ChainOfResponsibility.Part_2;

public class EmailLogger extends UserLogger{
    public EmailLogger(int userLevel) {
        super(userLevel);
    }

    @Override
    public void write(String message) {
        System.out.println("Email authentication: " + message + ": SUCCEEDED");
    }
}
