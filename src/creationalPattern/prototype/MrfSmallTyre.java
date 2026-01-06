package creationalPattern.prototype;

public class MrfSmallTyre extends Tyre{
    private final String type;

    public MrfSmallTyre(int thickness, int radius) {
        super(thickness, radius);
        this.type = "Small";
    }

    public MrfSmallTyre(MrfSmallTyre tyre) {
        super(tyre);
        this.type = tyre.type;
    }

    @Override
    public Tyre clone() {
        return new MrfSmallTyre(this);
    }
}
