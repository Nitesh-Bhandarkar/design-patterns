package behavioural.memento;

public class Memento {
    private final Object snapShot;

    public Memento(Object snapShot) {
        this.snapShot = snapShot;
    }

    public Object getSnapShot() {
        return snapShot;
    }
}
