package creationalPattern.builder.flightExample.builder;

import creationalPattern.builder.flightExample.components.*;
import creationalPattern.builder.flightExample.product.AirIndia;
import creationalPattern.builder.flightExample.product.Aircraft;

public class AirIndiaAircraftBuilder extends AircraftBuilder {
    AirIndia airIndia;

    @Override
    public void addEngine() {
        airIndia.setEngine(new Engine());
    }

    @Override
    public void addWheels() {
        airIndia.setWheel(new Wheel());
    }

    @Override
    public void addWings() {
        airIndia.setWing(new Wing());
    }

    @Override
    public void addCockpit() {
        airIndia.setCockpit(new Cockpit());
    }

    @Override
    public void addSeat() {
        airIndia.setSeat(new Seat());
    }

    @Override
    public void addWashroom() {
        airIndia.setWashroom(new Washroom());
    }

    @Override
    public void startBuilding() {
        airIndia = new AirIndia();
    }

    @Override
    public Aircraft getAircraft() {
        return airIndia;
    }
}
