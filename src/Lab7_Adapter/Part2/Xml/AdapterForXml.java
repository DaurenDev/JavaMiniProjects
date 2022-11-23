package Lab7_Adapter.Part2.Xml;

import Lab7_Adapter.Part2.Json.AnalyticsLibrary;

public class AdapterForXml implements StockDataProvider{
    AnalyticsLibrary analyticsLibrary;
    public AdapterForXml(AnalyticsLibrary analyticsLibrary){
        this.analyticsLibrary = analyticsLibrary;
    }
    @Override
    public void toXML() {
        this.analyticsLibrary.toJSON();
    }
}
