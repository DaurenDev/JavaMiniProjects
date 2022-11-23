package Lab10_Proxy.Part1;

public class ProxyImageLegs implements Image{
    RealImage realImage;
    private String fileName;

    public ProxyImageLegs(String fileName){
        this.fileName = fileName;
    }

    public void buildLegs(){
        System.out.print("\t_____\n");
        System.out.print("\t|   |\n");
        System.out.print("\t-----\n");
        System.out.print("\t /|\\  \n");
        System.out.print("\t/ | \\ \n");
        System.out.print("   /  |  \\\n");
        System.out.print("\t / \\  \n");
        System.out.print("\t/   \\ \n");
        System.out.print("   /     \\\n");
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        buildLegs();
    }
}
