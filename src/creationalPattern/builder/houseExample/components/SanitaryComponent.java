package creationalPattern.builder.houseExample.components;

public class SanitaryComponent {
    private final String name;
    private final int cost;

    public SanitaryComponent(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
}
