package com.task;

import Enums.EngineCondition;
import Enums.TypeOfWheel;

public class Car {
    private Engine engine;
    private String carMake;
    private Wheel wheel;
    private double tankFullness;

    Car() {
        this.engine = new Engine();
        this.tankFullness = 10.00;
        this.carMake = "noname";
        this.wheel = new Wheel();
    }

    public String getCarMake() {
        return carMake;
    }

    public void run() {
        engine.setCondition(EngineCondition.Works);
    }

    public void stop() {
        engine.setCondition(EngineCondition.DoesNotWork);
    }

    public void refuel(double fuel) {
        this.tankFullness += fuel;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void showCarMake() {
        System.out.println("car make: " + this.carMake);
    }

    public void ChangeWheel(TypeOfWheel type) {
        this.wheel = new Wheel(type);
    }
}
