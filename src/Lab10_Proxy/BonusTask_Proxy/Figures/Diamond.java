package Lab10_Proxy.BonusTask_Proxy.Figures;

import Lab10_Proxy.BonusTask_Proxy.Image;

public class Diamond implements Image {
    private String address;

    public Diamond(String address){
        this.address = address;
        loadDiamondPackage();
    }

    public void loadDiamondPackage(){
        System.out.println("Image <<Diamond>> is downloading...");
        System.out.println("<<DIAMOND>>");
    }



    @Override
    public void getImage() {
        System.out.println("<<Diamond>> was successfully downloaded from " + address + "\n");
    }

}
