package creationalPattern.factory;

public class PlasticBottleFactory extends BottleFactory{
    @Override
    Bottle createBottle() {
        return new PlasticBottle();
    }
}
