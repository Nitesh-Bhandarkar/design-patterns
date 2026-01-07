package creationalPattern.abstractFactory.tables;

import creationalPattern.abstractFactory.interfaces.Table;

public class PlainTable implements Table {
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
