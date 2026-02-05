package creationalPattern.builder.flightExample;

import creationalPattern.builder.flightExample.builder.AirIndiaAircraftBuilder;
import creationalPattern.builder.flightExample.builder.AircraftBuilder;
import creationalPattern.builder.flightExample.builder.FighterPlaneBuilder;

import java.util.Map;

public class Director<T> {
    Map<Class<? extends T>, AircraftBuilder> builderMap;

    public Director(Map<Class<? extends T>, AircraftBuilder> builderMap) {
        this.builderMap = builderMap;
    }

    public void constructAirIndiaPlane() {
        AirIndiaAircraftBuilder builder = (AirIndiaAircraftBuilder) builderMap.get(AirIndiaAircraftBuilder.class);
        builder.startBuilding();
        builder.addEngine();
        builder.addSeat();
        builder.addWashroom();
        builder.addWheels();
        builder.addWings();
        builder.addCockpit();
    }

    public void constructFighterPlane() {
        FighterPlaneBuilder builder = (FighterPlaneBuilder) builderMap.get(FighterPlaneBuilder.class);
        builder.startBuilding();
        builder.addEngine();
        builder.addSeat();
        builder.addWheels();
        builder.addWings();
        builder.addCockpit();
        builder.addGuns();
    }
}
