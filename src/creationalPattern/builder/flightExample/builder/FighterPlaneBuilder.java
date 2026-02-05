package creationalPattern.builder.flightExample.builder;

import creationalPattern.builder.flightExample.components.*;
import creationalPattern.builder.flightExample.product.Aircraft;
import creationalPattern.builder.flightExample.product.FighterPlane;

public class FighterPlaneBuilder extends AircraftBuilder {
    FighterPlane fighterPlane;

    @Override
    public void addEngine() {
        fighterPlane.setEngine(new Engine());
    }

    @Override
    public void addWheels() {
        fighterPlane.setWheel(new Wheel());
    }

    @Override
    public void addWings() {
        fighterPlane.setWing(new Wing());
    }

    @Override
    public void addCockpit() {
        fighterPlane.setCockpit(new Cockpit());
    }

    @Override
    public void addSeat() {
        fighterPlane.setSeat(new Seat());
    }

    @Override
    public void addWashroom() {
        fighterPlane.setWashroom(new Washroom());
    }

    @Override
    public void startBuilding() {
        fighterPlane = new FighterPlane();
    }

    @Override
    public Aircraft getAircraft() {
        return fighterPlane;
    }
}
