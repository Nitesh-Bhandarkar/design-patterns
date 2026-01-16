package creationalPattern.factory;

public class SteelBottleFactory extends BottleFactory{
    @Override
    Bottle createBottle() {
        return new SteelBottle();
    }
}
