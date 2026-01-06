package creationalPattern.singleton;
/**
 * Problem : Singleton fails in multithreaded environment. Where multiple objects can be created by different threads
 * */
public class SingletonTesterMultiThreaded {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Government government1 = Government.getGovernment("ABC");
            System.out.println(government1.getPrimeMinister());
        });

        Thread thread2 = new Thread(() -> {
            Government government2 = Government.getGovernment("DEF");
            System.out.println(government2.getPrimeMinister());
        });

        thread1.start();
        thread2.start();
    }
}
