package behavioural.observer;

public interface Consumer {
    String getName();
    void update(String newInfo);
}
