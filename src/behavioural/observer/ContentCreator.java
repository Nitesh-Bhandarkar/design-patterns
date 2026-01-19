package behavioural.observer;

import java.util.HashSet;
import java.util.Set;

public class ContentCreator implements Producer{
    private final Set<Consumer> consumers;
    private final StringBuilder sb;

    public ContentCreator() {
        this.consumers = new HashSet<>();
        sb = new StringBuilder();
    }

    @Override
    public void addConsumer(Consumer consumer) {
        consumers.add(consumer);
    }

    @Override
    public void removeConsumer(Consumer consumer) {
        System.out.println("Removing consumer : " + consumer.getName());
        consumers.remove(consumer);
    }

    @Override
    public void uploadNewContent(String content) {
        sb.append(content);
        notifyConsumers();
        sb.delete(0, sb.length());
    }

    @Override
    public void notifyConsumers() {
        consumers.forEach(c -> c.update(sb.toString()));
    }
}
