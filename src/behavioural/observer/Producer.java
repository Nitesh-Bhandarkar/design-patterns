package behavioural.observer;

public interface Producer {
    void addConsumer(Consumer consumer);
    void removeConsumer(Consumer consumer);
    void notifyConsumers();
    void uploadNewContent(String content);
}
