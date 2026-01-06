package creationalPattern.prototype;

public class MrfBigTyre extends Tyre{
    private final String type;

    public MrfBigTyre(int thickness, int radius) {
        super(thickness, radius);
        this.type = "Big";
    }

    public MrfBigTyre(MrfBigTyre tyre) {
        super(tyre);
        this.type = tyre.type;
    }

    @Override
    public Tyre clone() {
        return new MrfBigTyre(this);
    }
}
