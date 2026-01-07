package creationalPattern.abstractFactory.sofas;

import creationalPattern.abstractFactory.interfaces.Sofa;

public class PlainSofa implements Sofa {
    @Override
    public String getType() {
        return "Plain";
    }

    @Override
    public boolean canConvertToBed() {
        return false;
    }
}
