package ProxyPattern.Libraries;
import java.util.*;

public class Logging {
    Date date;
    public Logging() {
        this.date = new Date();
    }

    public void start() {
        System.out.println("LOG: \t" + this.date);
    }
}
