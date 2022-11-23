package CompositePattern;
import java.util.*;

public class DirectoryComposite extends Component {
    List<Component> list = new ArrayList<>();

    public DirectoryComposite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.list.add(component);
    }

    @Override
    public void remove(Component component) {
        this.list.remove(component);
    }

    public List<Component> getList() { return this.list; }

    @Override
    public void print(Component component) {  // <--
        System.out.println(component.tab + "name: " + component.name);
        component.tab += "\t";
        for(Component item : component.getList())
            if(item.getList() != null) {
                print(item);
            }
            else
                System.out.println(component.tab + item.name);
    }
}
