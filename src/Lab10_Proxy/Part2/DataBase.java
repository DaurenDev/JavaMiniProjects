package Lab10_Proxy.Part2;

public class DataBase implements InformationUsage{

    private String siteName;

    public DataBase(String siteName){
        this.siteName = siteName;
        load();
    }

    public void load(){
        System.out.println("Downloaded from " + siteName);
    }

    @Override
    public void getFile() {
        System.out.println("Files, downloaded from " + siteName + " was saved");
    }
}
