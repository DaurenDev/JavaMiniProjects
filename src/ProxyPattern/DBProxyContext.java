package ProxyPattern;
import ProxyPattern.Libraries.*;

public class DBProxyContext implements Context {
    private Context context;
    private Logging log;
    private Caching cache;
    public DBProxyContext() {
        this.context = new DBContext();
        this.log = new Logging();
    }

    @Override
    public String getOutput() {
        // additional logic
        this.log.start();
        String output = "";
        if(this.cache == null) {
            output = this.context.getOutput();
            this.cache = new Caching(output);
        } else {
            output = this.cache.getCache();
        }
        // additional logic
        return output;
    }
}
