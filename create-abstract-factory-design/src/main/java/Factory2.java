public class Factory2 implements IFactory {
    @Override
    public IAProduct productA() {
        return new A2Product();
    }

    @Override
    public IBProduct productB() {
        return new B2Product();
    }
}
