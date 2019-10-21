package safe;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    List<Component> components=new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public void operation() {
        components.parallelStream().forEach(component -> {
            component.operation();
        });
    }
}
