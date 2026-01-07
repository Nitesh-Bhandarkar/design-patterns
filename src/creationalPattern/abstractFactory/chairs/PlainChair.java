package creationalPattern.abstractFactory.chairs;

import creationalPattern.abstractFactory.interfaces.Chair;

public class PlainChair implements Chair {
    @Override
    public boolean canAdjustHeight() {
        return false;
    }

    @Override
    public boolean canBend() {
        return false;
    }

    @Override
    public boolean hasCushion() {
        return false;
    }
}
