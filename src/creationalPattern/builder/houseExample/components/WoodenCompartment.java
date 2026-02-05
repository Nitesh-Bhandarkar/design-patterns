package creationalPattern.builder.houseExample.components;

public class WoodenCompartment {
    private final int[] dimension;
    private final String compartmentName;

    public WoodenCompartment(int[] dimension, String compartmentName) {
        this.dimension = dimension;
        this.compartmentName = compartmentName;
    }

    public int[] getDimension() {
        return dimension;
    }

    public String getCompartmentName() {
        return compartmentName;
    }
}
