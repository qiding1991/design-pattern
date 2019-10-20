package proto;


public class ProtoTypeDemo implements Cloneable {
    private String name;

    public ProtoTypeDemo() {
        System.out.println("no params init ");
    }

    public ProtoTypeDemo(String name) {
        this.name = name;
        System.out.println("init witch params");
    }

    public String getName() {
        System.out.println("begin get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("begin set name");
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone object");
        return super.clone();
    }

    @Override
    public String toString() {
        return "ProtoTypeDemo{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoTypeDemo protoInstance = new ProtoTypeDemo("qiding");
        ProtoTypeDemo second = (ProtoTypeDemo) protoInstance.clone();
        protoInstance.setName("jellp");

        System.out.println(protoInstance == second);
        System.out.println(protoInstance);
        System.out.println(second);

    }
}
