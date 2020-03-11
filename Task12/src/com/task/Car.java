package com.task;

import Enums.EngineCondition;
import Enums.typeOfWheel;

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

    public void Run() {
        this.engine.setCondition(EngineCondition.Works);
    }

    public void Stop() {
        this.engine.setCondition(EngineCondition.DoesNotWork);
    }

    public void Refuel(double fuel) {
        this.tankFullness += fuel;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void ShowCarMake() {
        System.out.println("car make: " + this.carMake);
    }

    public void ChangeWheel(typeOfWheel type) {
        this.wheel = new Wheel(type);
    }
}
