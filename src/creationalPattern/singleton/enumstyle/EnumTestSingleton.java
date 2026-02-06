package creationalPattern.singleton.enumstyle;

public class EnumTestSingleton {
    public static void main(String[] args) {
        SingleTon s = SingleTon.INSTANCE;
        s.doSomething();
    }
}
