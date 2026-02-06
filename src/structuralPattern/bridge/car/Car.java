package structuralPattern.bridge.car;

public abstract class Car {
    CarImpl impl;
    public Car(CarImpl carImpl){
        this.impl = carImpl;
    }

    public abstract void getEngineType();
}
