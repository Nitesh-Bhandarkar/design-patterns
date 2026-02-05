package creationalPattern.builder.flightExample.builder;

import creationalPattern.builder.flightExample.product.Aircraft;

public abstract class AircraftBuilder {
    public void addEngine(){}
    public void addWheels(){}
    public void addWings(){}
    public void addCockpit(){}
    public void addSeat(){}
    public void addWashroom(){}
    public void addGuns(){}

    public abstract void startBuilding();
    public  abstract Aircraft getAircraft();

}
