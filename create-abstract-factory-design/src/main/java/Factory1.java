public class Factory1 implements IFactory {
    @Override
    public IAProduct productA() {
        return new A1Product();
    }

    @Override
    public IBProduct productB() {
        return new B1Product();
    }
}
