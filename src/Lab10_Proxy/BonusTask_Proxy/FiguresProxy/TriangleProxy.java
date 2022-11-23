package Lab10_Proxy.BonusTask_Proxy.FiguresProxy;

import Lab10_Proxy.BonusTask_Proxy.Figures.Triangle;
import Lab10_Proxy.BonusTask_Proxy.Image;

public class TriangleProxy implements Image {
    private String address;
    Triangle triangle;

    public TriangleProxy(String address){
        this.address = address;
    }

    public void triangle(){
        System.out.println("\t.\n   /|\n  / |\n /  |\n/   |\n-----");
        System.out.println();
    }

    @Override
    public void getImage() {
        if(triangle == null){
            triangle = new Triangle(address);
        }
        triangle.getImage();
        triangle();
    }
}
