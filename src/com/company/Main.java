package com.company;

import com.company.vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(8,false,"Dat-240Z","240Z","Datsun",2,false);

        System.out.println(car.toString());
    }
}
