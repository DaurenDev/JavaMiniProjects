package DecoratorPattern.Decorators;
import DecoratorPattern.*;
public class TomatoDecorator extends Decorator {
    public TomatoDecorator(Pizza pizza) {
        super(pizza.getName() + ", tomato", pizza);
    }
    @Override
    public double cost() {
        return 200 + pizza.cost();
    }
}
