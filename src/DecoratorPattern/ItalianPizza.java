package DecoratorPattern;

public class ItalianPizza extends Pizza{
    public ItalianPizza() {
        super("Italian pizza");
    }

    @Override
    public double cost() {
        return 2000;
    }
}
