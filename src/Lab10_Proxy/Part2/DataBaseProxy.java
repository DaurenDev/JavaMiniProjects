package Lab10_Proxy.Part2;

public class DataBaseProxy implements InformationUsage{

    private String siteName;
    DataBase dataBase;

    public DataBaseProxy(String siteName){
        this.siteName = siteName;
    }

    public void choiceMethod(){
        System.out.println("You chose exact files to download");
    }

    @Override
    public void getFile() {
        if(dataBase == null){
            dataBase = new DataBase(siteName);
        }
        choiceMethod();
        dataBase.getFile();
    }
}
