package Lab5.Task1.Decorator;

import Lab5.Task1.Shape;

public class RedShapeDecorator extends ShapeDecorator{
    Shape shape;
    public RedShapeDecorator(){
        super();
    }

    @Override
    public void draw() {
        System.out.println("A red line was drawn in your shape");
    }

}
