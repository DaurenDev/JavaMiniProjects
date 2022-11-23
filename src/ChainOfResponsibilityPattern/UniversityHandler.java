package ChainOfResponsibilityPattern;

public abstract class UniversityHandler {
    public UniversityHandler item; /// <-

    public UniversityHandler getItem() {
        return this.item;
    }

    public void setItem(UniversityHandler item) {
        this.item = item;
    }

    public void handle() { // bottle neck
        this.display();
        if(item != null) this.item.handle();
    }

    public abstract void display();
}
