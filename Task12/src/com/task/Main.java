package com.task;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
        менять колесо, вывести на консоль марку автомобиля. */
        Car car = new Car();
        car.run();
        car.stop();
        car.refuel(25.3);
        car.setCarMake("ford");
        car.showCarMake();
    }
}
