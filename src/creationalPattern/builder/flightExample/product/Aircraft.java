package creationalPattern.builder.flightExample.product;

import creationalPattern.builder.flightExample.components.*;

public abstract class Aircraft {
    Engine engine;
    Wheel wheel;
    Wing wing;
    Cockpit cockpit;
    Seat seat;
    Washroom washroom;
    public abstract void fly();
    public abstract void land();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setWashroom(Washroom washroom) {
        this.washroom = washroom;
    }
}
