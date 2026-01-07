package creationalPattern.abstractFactory.sofas;

import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.Sofa;

public class EconomicalSofa implements Sofa {
    @Override
    public String getType() {
        return "Economical";
    }

    @Override
    public boolean canConvertToBed() {
        return false;
    }
}
