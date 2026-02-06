package structuralPattern.decorator;

public class WheelDecorator implements CarDecorator{
    private final Car car;

    public WheelDecorator(Car car) {
        this.car = car;
    }

    public void decorateWheels(){
        System.out.println("Wheels upgraded \n");
    }

    @Override
    public void getFeature() {
        car.getFeature();
        decorateWheels();
    }
}
