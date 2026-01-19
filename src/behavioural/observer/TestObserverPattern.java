package behavioural.observer;

public class TestObserverPattern {
    public static void main(String[] args) {
        Producer producer = new ContentCreator();
        Consumer a = new Subscriber("ABC");
        Consumer b = new Subscriber("DEF");
        producer.addConsumer(a);
        producer.addConsumer(b);

        producer.uploadNewContent("Hello Wold");
        producer.removeConsumer(b);
        producer.uploadNewContent("Test test");


    }
}
