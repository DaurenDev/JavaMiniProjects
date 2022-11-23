package Lab10_Proxy.Part1;

public class ProxyImageHead implements Image{

    RealImage realImage;
    private String fileName;

    public ProxyImageHead(String fileName){
        this.fileName = fileName;
    }

    public void buildHead(){
        System.out.print("\t_____\n");
        System.out.print("\t|   |\n");
        System.out.print("\t-----\n");
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        buildHead();
    }
}
