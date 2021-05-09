package com.company;

public class Vehicle {
    public static void main(String[] args) {
        // create object red car and store the reference to a variable
        Car redCar = new Car("red", 4, 150);
        // create object blue car and store the reference to a variable
        Car blueCar = new Car("blue", 5, 180);

        System.out.printf("Red Car's initial speed: %d\n", redCar.getCurrentSpeed());
        // call method accelerate on object red car
        redCar.accelerate(50);
        System.out.printf("Red Car's speed after acceleration: %d\n", redCar.getCurrentSpeed());
        // call method breakDown on object red car
        redCar.breakDown(30);
        System.out.printf("Red Car's speed after breaking: %d\n\n", redCar.getCurrentSpeed());

        System.out.printf("Blue Car's initial speed: %d\n", blueCar.getCurrentSpeed());
        // call method accelerate on object blue car
        blueCar.accelerate(40);
        System.out.printf("Blue Car's speed after acceleration: %d\n", blueCar.getCurrentSpeed());
        // call method breakDown on object blue car
        blueCar.breakDown(20);
        System.out.printf("Blue Car's speed after breaking: %d\n\n", blueCar.getCurrentSpeed());

        // call static method of Car class
        System.out.printf("Red Car's number of wheels: %d\n", Car.numberOfWheels);
        System.out.printf("Blue Car's number of wheels: %d\n", Car.numberOfWheels);
    }
}
