package creationalPattern.singleton;

public class SingletonTester {
    public static void main(String[] args) {
        Government government = Government.getGovernment("Narendra Modi");
        System.out.println(government.getPrimeMinister());

        Government newGovernment = Government.getGovernment("Yogi");
        System.out.println(newGovernment.getPrimeMinister());

        government.setPrimeMinister("Yogi");
        System.out.println(government.getPrimeMinister());
        System.out.println(newGovernment.getPrimeMinister());

    }
}
