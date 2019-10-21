package opacity;

public class ComponentClient {
    public static void main(String[] args) {

        // c0={leaf1,{leaf2,leaf3}}
        Component c0=new Composite();
        Component c1=new Composite();

        Component leaf1=new Leaf("leaf1");
        Component leaf2=new Leaf("leaf2");
        Component leaf3=new Leaf("leaf3");

        c1.add(leaf2);
        c1.add(leaf3);
        c0.add(leaf1);
        c0.add(c1);

        c0.operation();




    }
}
