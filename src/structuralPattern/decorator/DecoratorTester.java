package structuralPattern.decorator;

public class DecoratorTester {
    public static void main(String[] args) {
        Car car = new Maruti();
        car.getFeature();

        Car seatUpgradedCar = new SeatDecorator(car);
        seatUpgradedCar.getFeature();

        Car wheelUpgradedCar = new WheelDecorator(seatUpgradedCar);
        wheelUpgradedCar.getFeature();
    }
}
