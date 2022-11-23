package Lab7_Adapter.Part2.Xml;

public class Xml implements StockDataProvider{
    @Override
    public void toXML() {
        System.out.println("Converted in XML");
    }
}
