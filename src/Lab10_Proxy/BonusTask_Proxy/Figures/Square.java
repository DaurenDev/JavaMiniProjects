package Lab10_Proxy.BonusTask_Proxy.Figures;

import Lab10_Proxy.BonusTask_Proxy.Image;

public class Square implements Image {
    private String address;

    public Square(String address){
        this.address = address;
        loadSquarePackage();
    }

    public void loadSquarePackage(){
        System.out.println("Image <<Square>> is downloading...");
        System.out.println("<<SQUARE>>");
    }


    @Override
    public void getImage() {
        System.out.println("<<Square>> was successfully downloaded from " + address + "\n");
    }
}
