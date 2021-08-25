package com.careerdevs.vehicles;

public abstract class Vehicle extends Engine{

    private String model;
    private String brand;
    private String manufacture;
    private boolean isAutomatic;

    public Vehicle(int numberOfCyclinders, boolean isRunning, String model, String brand, String manufacture, int doors, boolean isAutomatic) {
        super(numberOfCyclinders, isRunning);
        this.model = model;
        this.brand = brand;
        this.manufacture = manufacture;
        this.isAutomatic = isAutomatic;
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
}
