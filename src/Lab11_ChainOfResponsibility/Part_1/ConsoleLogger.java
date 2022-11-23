package Lab11_ChainOfResponsibility.Part_1;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int loggingLevel){
        super(loggingLevel);
    }

    @Override
    public void write(String message) throws InterruptedException {
        System.out.println("Console Logger: " + message + " ----> SORTED");
    }
}
