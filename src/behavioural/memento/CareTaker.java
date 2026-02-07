package behavioural.memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
    Map<String, Memento> mementoMap;

    public CareTaker() {
        mementoMap = new HashMap<>();
    }

    public void storeMemento(String key, Memento memento){
        mementoMap.put(key, memento);
    }

    public Memento getMemento(String key){
        return mementoMap.get(key);
    }
}

