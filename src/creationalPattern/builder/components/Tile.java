package creationalPattern.builder.components;

public class Tile {
    private final int[] size;
    private final String color;

    public Tile(int[] size, String color) {
        this.size = size;
        this.color = color;
    }

    public int[] getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
