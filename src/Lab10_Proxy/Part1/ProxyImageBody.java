package Lab10_Proxy.Part1;

public class ProxyImageBody implements Image{
    RealImage realImage;
    private String fileName;

    public ProxyImageBody(String fileName){
        this.fileName = fileName;
    }

    public void buildBody(){
        System.out.print("\t_____\n");
        System.out.print("\t|   |\n");
        System.out.print("\t-----\n");
        System.out.print("\t  |  \n");
        System.out.print("\t  |  \n");
        System.out.print("\t  |  \n");
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        buildBody();
    }
}
