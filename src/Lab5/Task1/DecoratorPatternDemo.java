package Lab5.Task1;

import Lab5.Task1.Decorator.RedShapeDecorator;
import Lab5.Task1.Shapes.Circle;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        circle = new RedShapeDecorator();
        circle.draw();



    }
}
