package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class AirForce {
    private final List<AirCraft> jets;
    private final List<AirCraft> passengerPlanes;

    public AirForce() {
        this.jets = new ArrayList<>();
        this.passengerPlanes = new ArrayList<>();
        jets.add(new JetPlane("JetPlane"));
        passengerPlanes.add(new PassengerPlane("Plane 1"));
        passengerPlanes.add(new PassengerPlane("Plane 2"));
    }

    public Iterator<AirCraft> createJetPlaneIterator(){
        return new JetPlaneIterator(jets);
    }

    public Iterator<AirCraft> createPassengerPlaneIterator(){
        return new PassengerPlaneIterator(passengerPlanes);
    }

    public Iterator<AirCraft> createAirForceIterator(){
        return new AirForceIteratorIterator(jets, passengerPlanes);
    }
}
