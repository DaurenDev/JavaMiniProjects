package ProxyPattern.Libraries;
import java.util.*;

public class Caching {
    private String txt;
    public Caching(String txt) {
        this.txt = txt;
    }

    public String getCache() {
        Date date = new Date();
        return "FROM CACHE \t: " + date + "\t\"" + this.txt + "\"";
    }
}
