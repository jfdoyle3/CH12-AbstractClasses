package com.company.vehicles;

public class Engine {

    protected int numberOfCyclinders;
    protected boolean isRunning;

    public Engine(int numberOfCyclinders, boolean isRunning) {
        this.numberOfCyclinders = numberOfCyclinders;
        this.isRunning = isRunning;
    }

    private void flipSwitch(){
        boolean flip=isRunning ? true : false;

    }
    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCyclinders=" + numberOfCyclinders +
                ", isRunning=" + isRunning +
                '}';
    }
}
