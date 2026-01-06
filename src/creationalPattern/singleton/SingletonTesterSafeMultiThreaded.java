package creationalPattern.singleton;
/**
 * Solution : Singleton fails in multithreaded environment. Where multiple objects can be created by different threads
 * */
public class SingletonTesterSafeMultiThreaded {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            ThreadSafeGovernment government1 = ThreadSafeGovernment.getGovernment("ABC");
            System.out.println(government1.getPrimeMinister());
        });

        Thread thread2 = new Thread(() -> {
            ThreadSafeGovernment government2 = ThreadSafeGovernment.getGovernment("DEF");
            System.out.println(government2.getPrimeMinister());
        });

        thread1.start();
        thread2.start();
    }
}
