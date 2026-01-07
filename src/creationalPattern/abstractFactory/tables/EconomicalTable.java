package creationalPattern.abstractFactory.tables;

import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.Table;

public class EconomicalTable implements Table {
    @Override
    public int getLegs() {
        return 3;
    }

    @Override
    public boolean isFoldable() {
        return false;
    }
}
