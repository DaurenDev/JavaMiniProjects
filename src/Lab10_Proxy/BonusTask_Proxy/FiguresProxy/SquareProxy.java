package Lab10_Proxy.BonusTask_Proxy.FiguresProxy;

import Lab10_Proxy.BonusTask_Proxy.Figures.Square;
import Lab10_Proxy.BonusTask_Proxy.Image;

public class SquareProxy implements Image {
    private String address;
    Square square;

    public SquareProxy(String address){
        this.address = address;
    }

    public void square(){
        System.out.println("----------" + "\n|\t\t |\n|\t\t |\n|\t\t |\n----------");
        System.out.println();
    }

    @Override
    public void getImage() {
        if(square == null){
            square = new Square(address);
        }
        square.getImage();
        square();
    }
}
