package creationalPattern.builder.flightExample;

import creationalPattern.builder.flightExample.builder.AirIndiaAircraftBuilder;
import creationalPattern.builder.flightExample.builder.AircraftBuilder;
import creationalPattern.builder.flightExample.builder.FighterPlaneBuilder;
import creationalPattern.builder.flightExample.product.Aircraft;

import java.util.HashMap;
import java.util.Map;

public class FlightMain {
    public static void main(String[] args) {
        Map<Class<? extends AircraftBuilder>, AircraftBuilder> map = new HashMap<>();
        map.put(AirIndiaAircraftBuilder.class, new AirIndiaAircraftBuilder());
        map.put(FighterPlaneBuilder.class, new FighterPlaneBuilder());
        Director<AircraftBuilder> director = new Director<>(map);
        director.constructAirIndiaPlane();
        director.constructFighterPlane();

        AircraftBuilder builder = map.get(AirIndiaAircraftBuilder.class);
        Aircraft aircraft = builder.getAircraft();
        aircraft.fly();
        aircraft.land();

        AircraftBuilder builder1 = map.get(FighterPlaneBuilder.class);
        Aircraft aircraft1 = builder1.getAircraft();
        aircraft1.fly();
        aircraft1.land();




    }
}
