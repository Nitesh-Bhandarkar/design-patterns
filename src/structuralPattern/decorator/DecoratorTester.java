package structuralPattern.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

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
