package DecoratorPattern.Decorators;

import DecoratorPattern.*;

public abstract class Decorator extends Pizza {
    Pizza pizza;
    public Decorator(String name, Pizza pizza) {
        super(name);
        this.pizza = pizza;
    }
}
