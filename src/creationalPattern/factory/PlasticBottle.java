package creationalPattern.factory;

public class PlasticBottle implements Bottle{
    @Override
    public void fillWater() {
        System.out.println("Fill water in Plastic bottle");
    }
}
