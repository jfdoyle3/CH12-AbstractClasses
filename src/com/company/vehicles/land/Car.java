package com.company.vehicles.land;

import com.company.vehicles.Vehicle;

public class Car extends Vehicle {

    private int doors;


    public Car(int numberOfCyclinders, boolean isRunning, String model, String brand, String manufacture, int doors, boolean isAutomatic) {
        super(numberOfCyclinders, isRunning, model, brand, manufacture, doors, isAutomatic);
        this.doors=doors;
    }

    @Override
    public void horn() {
        System.out.println("Beep!");
    }

    @Override
    public void turnOn() {
        flipSwitch();
    }

    @Override
    public void turnOff() {
        flipSwitch();
    }


    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", numberOfCyclinders=" + super.numberOfCyclinders +
                ", isRunning=" + super.isRunning +
                '}';
    }


}


