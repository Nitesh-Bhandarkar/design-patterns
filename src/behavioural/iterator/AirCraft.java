package behavioural.iterator;

public abstract class AirCraft {
    private final String name;

    public AirCraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
