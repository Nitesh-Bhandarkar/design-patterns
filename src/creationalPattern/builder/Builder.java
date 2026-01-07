package creationalPattern.builder;

import creationalPattern.builder.components.SanitaryComponent;
import creationalPattern.builder.components.Tile;
import creationalPattern.builder.components.WoodenCompartment;

import java.util.List;

public interface Builder {
    void setTiles(Tile tiles);
    void setWoodenCompartment(WoodenCompartment woodenCompartments);
    void setSanitaryComponents(SanitaryComponent sanitaryComponents);
}
