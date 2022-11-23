package Lab10_Proxy.BonusTask_Proxy.Figures;

import Lab10_Proxy.BonusTask_Proxy.Image;

public class Triangle implements Image {
    private String address;

    public Triangle(String address){
        this.address = address;
        loadTrianglePackage();
    }

    public void loadTrianglePackage(){
        System.out.println("Image <<Triangle>> is downloading...");
        System.out.println("<<TRIANGLE>>");
    }


    @Override
    public void getImage() {
        System.out.println("<<Triangle>> was successfully downloaded from " + address + "\n");
    }
}
