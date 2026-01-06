package creationalPattern.singleton;

import java.util.Objects;

public class Government {
    //Step 1 : Create a static Object of same class so that it will be reused all the time
    private static Government governmentSingletonInstance;
    private String primeMinister;

    //Step 2 : Create a private constructor so that no one can create a new instance of the object
    private Government(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    //Step 3 : Create a static method to get or create an instance of singleton object of the class
    public static Government getGovernment(String primeMinister) {
        if (governmentSingletonInstance == null) {
            governmentSingletonInstance = new Government(primeMinister);
        }

        return governmentSingletonInstance;
    }

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }
}
