package creationalPattern.builder.flightExample.product;

public class FighterPlane extends Aircraft{
    @Override
    public void fly() {
        System.out.println("FighterPlane Flying");
    }

    @Override
    public void land() {
        System.out.println("FighterPlane Landing");

    }
}
