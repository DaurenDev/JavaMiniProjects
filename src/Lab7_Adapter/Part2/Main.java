package Lab7_Adapter.Part2;

import Lab7_Adapter.Part2.Json.AdapterForJson;
import Lab7_Adapter.Part2.Json.AnalyticsLibrary;
import Lab7_Adapter.Part2.Json.Json;
import Lab7_Adapter.Part2.Xml.AdapterForXml;
import Lab7_Adapter.Part2.Xml.StockDataProvider;
import Lab7_Adapter.Part2.Xml.Xml;

public class Main {
    public static void main(String[] args) {
        StockDataProvider stockDataProvider = new Xml();
        AnalyticsLibrary analyticsLibrary = new Json();

        StockDataProvider adapter = new AdapterForXml(analyticsLibrary);
        adapter.toXML();

        AnalyticsLibrary adapter1 = new AdapterForJson(stockDataProvider);
        adapter1.toJSON();
    }
}
