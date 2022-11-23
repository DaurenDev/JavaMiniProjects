package DecoratorPattern;
// this
// super
public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super("Pepperoni Pizza");
    }

    @Override
    public double cost() {
        return 1000;
    }
}
