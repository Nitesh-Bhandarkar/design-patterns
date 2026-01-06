package creationalPattern.prototype;

public abstract class Tyre {
    private int radius;
    private int thickness;

    public Tyre(int thickness, int radius) {
        this.thickness = thickness;
        this.radius = radius;
    }

    public Tyre(Tyre tyre) {
        if(tyre != null){
            this.radius = tyre.radius;
            this.thickness = tyre.thickness;
        }
    }

    public abstract Tyre clone();
}
