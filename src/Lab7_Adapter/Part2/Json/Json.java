package Lab7_Adapter.Part2.Json;

public class Json implements AnalyticsLibrary{
    @Override
    public void toJSON() {
        System.out.println("Converted in JSON");
    }
}
