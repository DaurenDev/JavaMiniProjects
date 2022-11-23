package DecoratorPattern;

public abstract class Pizza {
    protected String name = "";
    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double cost();
}
