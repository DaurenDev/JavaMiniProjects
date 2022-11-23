package TempateMethodPattern;

public abstract class Education {

    public void templateMethod() {
        enter();
        study();
        passExam();
        getDocument();
    }

    public void enter() {
        System.out.println("enter");
    }

    public abstract void study();

    public void passExam() {
        System.out.println("pass exam");
    }
    public abstract  void getDocument();
}
