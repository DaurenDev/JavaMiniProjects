package Lab10_Proxy.Part1;

public class ProxyImageArms implements Image{
    RealImage realImage;
    private String fileName;

    public ProxyImageArms(String fileName){
        this.fileName = fileName;
    }

    public void buildArms(){
        System.out.print("\t_____\n");
        System.out.print("\t|   |\n");
        System.out.print("\t-----\n");
        System.out.print("\t /|\\  \n");
        System.out.print("\t/ | \\ \n");
        System.out.print("   /  |  \\\n");
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        buildArms();
    }
}
