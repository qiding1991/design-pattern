package safe;

public class Leaf implements Component {
    String name;
    public Leaf(String name) {
        this.name=name;
    }
    @Override
    public void operation() {
        System.out.println(name+"执行成功");
    }
}
