package creationalPattern.factory;

public class FactoryMain {
    public static void main(String[] args) {
        BottleFactory factory = new PlasticBottleFactory();
        factory.makeBottle();

        factory = new SteelBottleFactory();
        factory.makeBottle();
    }
}
