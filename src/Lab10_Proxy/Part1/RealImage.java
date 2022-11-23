package Lab10_Proxy.Part1;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading images from " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying images downloaded from " + fileName);
    }


}
