package creationalPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class TyreFactory {
    private final Map<String, Tyre> factory;

    public TyreFactory() {
        this.factory = new HashMap<>();
        MrfSmallTyre smallTyre = new MrfSmallTyre(10, 8);
        MrfBigTyre bigTyre = new MrfBigTyre(100, 50);
        factory.put("Small Tyre", smallTyre);
        factory.put("Big Tyre", bigTyre);
    }

    public Tyre getType(String type){
        return factory.get(type).clone();
    }
}
