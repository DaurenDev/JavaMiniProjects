package CompositePattern;
import java.util.*;

public abstract class Component {
    protected String name;
    protected String tab = "";

    public Component(String name) {
        this.name = name;
    }

    public void add(Component component) { }
    public void remove(Component component) { }
    public void print(Component component) { }

    public List<Component> getList() { return null; }
}
