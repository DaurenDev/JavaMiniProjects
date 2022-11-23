package Lab11_ChainOfResponsibility.Part_1;

public class FileLogger extends AbstractLogger{
    public FileLogger(int loggingLevel) {
        super(loggingLevel);
    }

    @Override
    public void write(String message) throws InterruptedException {
        System.out.println("File Logger: " + message + " ----> SORTED");
    }
}
