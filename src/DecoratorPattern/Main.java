package DecoratorPattern;
import DecoratorPattern.*;
import DecoratorPattern.Decorators.*;


public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PepperoniPizza();//new TomatoDecorator(new CheeseDecorator(new PepperoniPizza()));
        pizza = new CheeseDecorator(pizza);
        pizza = new TomatoDecorator(pizza);

        System.out.println("NAME: \"" + pizza.getName() + "\" \t COST: " + pizza.cost());
    }
}

