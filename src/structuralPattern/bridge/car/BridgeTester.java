package structuralPattern.bridge.car;

public class BridgeTester {
    public static void main(String[] args) {
        Car car = new IndiaCar(new IndiaCarImpl());
        car.getEngineType();

        car = new IndiaCar(new UsCarImpl());
        car.getEngineType();
    }
}
