package creationalPattern.factory;

public abstract class BottleFactory {
    public void makeBottle(){
        Bottle bottle = createBottle();
        System.out.println("Created a bottle \n");
        bottle.fillWater();
    }

    abstract Bottle createBottle();
}
