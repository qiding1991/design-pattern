package opacity;

public class Leaf implements Component {
    String name;
    public Leaf(String name) {
        this.name=name;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println(name+"执行成功");
    }
}
