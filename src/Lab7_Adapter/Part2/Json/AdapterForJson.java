package Lab7_Adapter.Part2.Json;

import Lab7_Adapter.Part2.Xml.StockDataProvider;

public class AdapterForJson implements AnalyticsLibrary{
    StockDataProvider stockDataProvider;
    public AdapterForJson(StockDataProvider stockDataProvider){
        this.stockDataProvider = stockDataProvider;
    }

    @Override
    public void toJSON() {
        this.stockDataProvider.toXML();
    }
}
