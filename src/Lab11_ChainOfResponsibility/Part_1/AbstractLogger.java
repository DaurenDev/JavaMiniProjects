package Lab11_ChainOfResponsibility.Part_1;

public abstract class AbstractLogger {
    private int loggingLevel;
    private AbstractLogger abstractLogger;

    public AbstractLogger(int loggingLevel){
        this.loggingLevel = loggingLevel;
    }

    public void setAbstractLogger(AbstractLogger abstractLogger){
        this.abstractLogger = abstractLogger;
    }

    public void logMessage(String message, int level) throws InterruptedException {
        if(level >= loggingLevel){
            write(message);
        }
        if(abstractLogger != null){
            abstractLogger.logMessage(message, level);
        }
    }

    public abstract void write(String message) throws InterruptedException;
}
