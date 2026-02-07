package behavioural.iterator;

import java.util.List;

public class AirForceIteratorIterator implements Iterator<AirCraft> {

    private final List<AirCraft> planeList;
    private final List<AirCraft> jetPlanes;
    private int idx;
    private int jetIdx;

    public AirForceIteratorIterator(List<AirCraft> planeList, List<AirCraft> jetPlanes) {
        this.planeList = planeList;
        this.jetPlanes = jetPlanes;
        idx = 0;
        jetIdx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx <= planeList.size() - 1 || jetIdx <= jetPlanes.size() - 1;
    }

    @Override
    public AirCraft next() {
        if (idx <= planeList.size() - 1) {
            return planeList.get(idx++);
        } else if (jetIdx <= jetPlanes.size() - 1) {
            return jetPlanes.get(jetIdx++);
        }

        return null;
    }
}
