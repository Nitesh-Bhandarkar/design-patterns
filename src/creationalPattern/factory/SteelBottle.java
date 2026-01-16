package creationalPattern.factory;

public class SteelBottle implements Bottle{
    @Override
    public void fillWater() {
        System.out.println("Filling water inside Steel Bottle");
    }
}
