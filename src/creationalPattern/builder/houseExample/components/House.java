package creationalPattern.builder.houseExample.components;

import java.util.Arrays;

public class House {
    private Tile tiles;
    private WoodenCompartment woodenCompartments;
    private SanitaryComponent sanitaryComponents;

    public House(Tile tiles, WoodenCompartment woodenCompartments, SanitaryComponent sanitaryComponents) {
        this.tiles = tiles;
        this.woodenCompartments = woodenCompartments;
        this.sanitaryComponents = sanitaryComponents;
    }

    @Override
    public String toString() {
        String base = "Below of the component of the house \n";
        if(tiles != null){
            base = base + "Tile with color : " + tiles.getColor() + " size as" + Arrays.toString(tiles.getSize());
        }

        if(woodenCompartments != null){
            base = base + "Wooden compartment with name :" + woodenCompartments.getCompartmentName() + " Size as : "+ Arrays.toString(woodenCompartments.getDimension());
        }

        if(sanitaryComponents != null){
            base = base + "Sanitary component with name :" + sanitaryComponents.getName() + " Cost as : "+ sanitaryComponents.getCost();
        }
        return base;
    }
}
