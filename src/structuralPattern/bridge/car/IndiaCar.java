package structuralPattern.bridge.car;

public class IndiaCar extends Car{
    public IndiaCar(CarImpl carImpl) {
        super(carImpl);
    }

    @Override
    public void getEngineType() {
        System.out.println(this.impl.getEngine());
    }
}
