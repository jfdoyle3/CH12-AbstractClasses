package com.company.animals;

public class HouseCat extends Cat {

    public HouseCat(String name, String color, int weightInGrams, boolean isNeutered, String spieces) {
        super(name, color, weightInGrams, isNeutered, spieces);
    }

    public void meow() {
        System.out.println("Meow!!");
    }
}
