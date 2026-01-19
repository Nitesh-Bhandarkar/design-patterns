package behavioural.observer;

public class Subscriber implements Consumer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String newInfo) {
        System.out.println(name + " : " +newInfo);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Subscriber subscriber = (Subscriber) obj;
        return this.name.equals(subscriber.name);
    }
}
