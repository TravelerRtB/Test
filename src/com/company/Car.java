package com.company;

public class Car {

    static int numberOfWheels = 4;

    private String color;
    private int numberOfSeets;
    private int maxSpeed;
    private int currentSpeed = 0;

    Car(String color, int numberOfSeets, int maxSpeed) {
        this.color = color;
        this.numberOfSeets = numberOfSeets;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int toSpeed) {
        this.currentSpeed = toSpeed;
    }

    public void breakDown(int toSpeed) {
        this.currentSpeed = toSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
