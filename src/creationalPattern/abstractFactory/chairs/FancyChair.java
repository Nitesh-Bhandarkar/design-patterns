package creationalPattern.abstractFactory.chairs;

import creationalPattern.abstractFactory.interfaces.Chair;

public class FancyChair implements Chair {
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
        return true;
    }
}
