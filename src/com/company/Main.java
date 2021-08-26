package com.company;

import com.company.vehicles.land.Car;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(8,false,"Dat-240Z","240Z","Datsun",2,false);
        car.addPassenger("Jim");
        System.out.println("List of Passengers:");
        car.displayPassengerList();
        car.removePassenger("Jim");
        System.out.println("\n\nList of passenger after remove 20");
        car.displayPassengerList();
        System.out.println(car.toString());
    }
}
