package structuralPattern.decorator;

public class SeatDecorator implements CarDecorator{
    private final Car car;

    public SeatDecorator(Car car) {
        this.car = car;
    }

    public void decorateSeats(){
        System.out.println("Seats upgraded \n");
    }

    @Override
    public void getFeature() {
        car.getFeature();
        decorateSeats();
    }
}
