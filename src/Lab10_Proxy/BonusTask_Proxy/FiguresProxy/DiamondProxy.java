package Lab10_Proxy.BonusTask_Proxy.FiguresProxy;

import Lab10_Proxy.BonusTask_Proxy.Figures.Diamond;
import Lab10_Proxy.BonusTask_Proxy.Image;

public class DiamondProxy implements Image {
    private String address;
    Diamond diamond;

    public DiamondProxy(String address){
        this.address = address;
    }

    public void diamond(){
        System.out.println("   /|\\\n  / | \\\n /  |  \\\n/   |   \\\n---------\n" +
                "\\   |   /\n \\  |  /\n  \\ | /\n   \\|/");
        System.out.println();
    }

    @Override
    public void getImage() {
        if(diamond == null){
            diamond = new Diamond(address);
        }
        diamond.getImage();
        diamond();
    }
}
