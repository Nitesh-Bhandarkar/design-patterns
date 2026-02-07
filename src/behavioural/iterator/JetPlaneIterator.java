package behavioural.iterator;

import java.util.List;

public class JetPlaneIterator implements Iterator<AirCraft>{

    private final List<AirCraft> planeList;
    private int idx;

    public JetPlaneIterator(List<AirCraft> planeList) {
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
