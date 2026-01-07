package creationalPattern.builder;

import creationalPattern.builder.components.SanitaryComponent;
import creationalPattern.builder.components.Tile;
import creationalPattern.builder.components.WoodenCompartment;

public class HouseBuilder implements Builder {
    private Tile tiles;
    private WoodenCompartment woodenCompartments;
    private SanitaryComponent sanitaryComponents;


    @Override
    public void setTiles(Tile tiles) {
        this.tiles = tiles;
    }

    @Override
    public void setWoodenCompartment(WoodenCompartment woodenCompartments) {
        this.woodenCompartments = woodenCompartments;
    }

    @Override
    public void setSanitaryComponents(SanitaryComponent sanitaryComponents) {
        this.sanitaryComponents = sanitaryComponents;
    }

    public House getHouse(){
        return new House(tiles, woodenCompartments, sanitaryComponents);
    }
}
