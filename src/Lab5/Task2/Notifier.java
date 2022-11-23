package Lab5.Task2;

public abstract class Notifier {
    protected String message = "";
    public Notifier(String message){
        this.message = message;
    }

    public String sendFor(){
        return this.message;
    }

    public void query(){
        System.out.println("Where would you like to receive a message?");
    }
}