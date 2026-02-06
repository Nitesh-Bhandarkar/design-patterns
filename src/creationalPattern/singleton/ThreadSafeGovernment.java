package creationalPattern.singleton;

public class ThreadSafeGovernment {
    //Step 1 : Create a static Object of same class so that it will be reused all the time
    private volatile static ThreadSafeGovernment governmentSingletonInstance;
    private String primeMinister;

    //Step 2 : Create a private constructor so that no one can create a new instance of the object
    private ThreadSafeGovernment(String primeMinister) {
        this.primeMinister = primeMinister;
    }

    //Step 3 : Create a static method to get or create an instance of singleton object of the class
    public static ThreadSafeGovernment getGovernment(String primeMinister) {
        synchronized(ThreadSafeGovernment.class){
            if (governmentSingletonInstance == null) {
                governmentSingletonInstance = new ThreadSafeGovernment(primeMinister);
            }
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
