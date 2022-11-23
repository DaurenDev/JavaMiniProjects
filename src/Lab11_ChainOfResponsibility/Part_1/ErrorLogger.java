package Lab11_ChainOfResponsibility.Part_1;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int loggingLevel) {
        super(loggingLevel);
    }

    @Override
    public void write(String message) throws InterruptedException {
        System.out.println("Error Logger: " + message + " ----> SORTED");
    }
}
