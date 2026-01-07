package creationalPattern.builder;

import creationalPattern.builder.components.SanitaryComponent;
import creationalPattern.builder.components.Tile;
import creationalPattern.builder.components.WoodenCompartment;

import java.util.ArrayList;

public class Architect {
    public void constructPlainHouse(Builder builder){
        builder.setTiles(new Tile(new int[]{2, 2}, "Blue"));
        builder.setSanitaryComponents(new SanitaryComponent("Jaguar Wash basin", 100));
    }

    public void constructFurnishedHouse(Builder builder){
        builder.setTiles(new Tile(new int[]{4, 4}, "Grey"));
        builder.setSanitaryComponents(new SanitaryComponent("Jaguar Wash basin", 1000));
        builder.setWoodenCompartment(new WoodenCompartment(new int[]{10, 10}, "Cuboard"));
    }
}
