package creationalPattern.abstractFactory.chairs;

import creationalPattern.abstractFactory.interfaces.Chair;

public class EconomicalChair implements Chair {
    @Override
    public boolean canAdjustHeight() {
        return true;
    }

    @Override
    public boolean canBend() {
        return true;
    }

    @Override
    public boolean hasCushion() {
        return false;
    }
}
