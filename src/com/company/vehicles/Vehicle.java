package com.company.vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle extends Engine{

    private String model;
    private String brand;
    private String manufacture;
    private boolean isAutomatic;
    private List<Passenger> passengers;

    public Vehicle(int numberOfCyclinders, boolean isRunning, String model, String brand, String manufacture, int doors, boolean isAutomatic) {
        super(numberOfCyclinders, isRunning);
        this.model = model;
        this.brand = brand;
        this.manufacture = manufacture;
        this.isAutomatic = isAutomatic;
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(String name){
        passengers.add(new Passenger(name));
    }

    public void removePassenger(String name){
        //TODO: search for name in list and remove @ index
        passengers.remove(0);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", isAutomatic=" + isAutomatic +
                super.numberOfCyclinders+ super.isRunning+
                '}';
    }

    public abstract void horn();
    public abstract void turnOn();
    public abstract void turnOff();
}
