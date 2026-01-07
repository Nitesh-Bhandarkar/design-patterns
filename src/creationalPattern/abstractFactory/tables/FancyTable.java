package creationalPattern.abstractFactory.tables;

import creationalPattern.abstractFactory.interfaces.Table;

public class FancyTable implements Table {
    @Override
    public int getLegs() {
        return 4;
    }

    @Override
    public boolean isFoldable() {
        return true;
    }
}
