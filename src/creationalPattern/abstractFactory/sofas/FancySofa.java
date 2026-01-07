package creationalPattern.abstractFactory.sofas;

import creationalPattern.abstractFactory.interfaces.Chair;
import creationalPattern.abstractFactory.interfaces.Sofa;

public class FancySofa implements Sofa {

    @Override
    public String getType() {
        return "Fancy";
    }

    @Override
    public boolean canConvertToBed() {
        return true;
    }
}
