package behavioural.iterator;

import java.util.List;

public class PassengerPlaneIterator implements Iterator<AirCraft>{

    private final List<AirCraft> planeList;
    private int idx;

    public PassengerPlaneIterator(List<AirCraft> planeList) {
        this.planeList = planeList;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx <= planeList.size()-1;
    }

    @Override
    public AirCraft next() {
        return planeList.get(idx++);
    }
}
