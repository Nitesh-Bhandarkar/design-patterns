package behavioural.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        AirForce airForce = new AirForce();
        Iterator<AirCraft> jetIterator = airForce.createJetPlaneIterator();
        while(jetIterator.hasNext()){
            AirCraft airCraft = jetIterator.next();
            System.out.println(airCraft.getName());
        }

        Iterator<AirCraft> passengerIterator = airForce.createPassengerPlaneIterator();
        while(passengerIterator.hasNext()){
            AirCraft airCraft = passengerIterator.next();
            System.out.println(airCraft.getName());
        }

        Iterator<AirCraft> airForceIterator = airForce.createAirForceIterator();
        while(airForceIterator.hasNext()){
            AirCraft airCraft = airForceIterator.next();
            System.out.println(airCraft.getName());
        }


    }
}
