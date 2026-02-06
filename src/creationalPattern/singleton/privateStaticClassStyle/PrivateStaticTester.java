package creationalPattern.singleton.privateStaticClassStyle;

public class PrivateStaticTester {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        obj.doSomething();
    }
}
