package creationalPattern.builder.flightExample.product;

public class AirIndia extends Aircraft{
    @Override
    public void fly() {
        System.out.println("AirIndia Flying");
    }

    @Override
    public void land() {
        System.out.println("AirIndia Landing");

    }
}
