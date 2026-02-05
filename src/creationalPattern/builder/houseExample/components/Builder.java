package creationalPattern.builder.houseExample.components;

public interface Builder {
    void setTiles(Tile tiles);
    void setWoodenCompartment(WoodenCompartment woodenCompartments);
    void setSanitaryComponents(SanitaryComponent sanitaryComponents);
}
