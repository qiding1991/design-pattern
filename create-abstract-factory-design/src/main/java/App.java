public class App {
    public static void main(String[] args) {
        System.out.println("hello world abstract factory");

        IFactory factory1=new Factory1();
        IFactory factory2=new Factory2();

        IAProduct a1=  factory1.productA();
        IBProduct b1=  factory1.productB();
        IAProduct a2=  factory2.productA();
        IBProduct b2=  factory2.productB();

        a1.methodA();
        b1.methodB();




        a2.methodA();
        b2.methodB();
    }
}
