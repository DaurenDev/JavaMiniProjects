package DecoratorPattern.Decorators;
import DecoratorPattern.*;
public class CheeseDecorator extends Decorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza.getName() + ", Cheese", pizza);
    }

    @Override
    public double cost() {
        return 100 + pizza.cost();
    }
}
