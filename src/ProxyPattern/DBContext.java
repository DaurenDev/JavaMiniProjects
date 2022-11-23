package ProxyPattern;
import java.util.*;

public class DBContext implements Context{
    Date date;
    public DBContext() {
        this.date = new Date();
    }
    public String getOutput() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "FROM DB OUTPUT: \t" + this.date;
    }
}
