package behavioural.memento;

public class MementoTester {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.updateCounter();
        System.out.println(creator.getCount());

        Memento memento = creator.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.storeMemento("v1", memento);

        creator.updateCounter();
        creator.updateCounter();
        creator.updateCounter();
        careTaker.storeMemento("v2", creator.createMemento());
        System.out.println(creator.getCount());


        creator.updateState(careTaker.getMemento("v1"));
        System.out.println(creator.getCount());

        creator.updateState(careTaker.getMemento("v2"));
        System.out.println(creator.getCount());
    }
}
