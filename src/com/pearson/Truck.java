package com.pearson;

public class Truck {

    String truckDriver;
    int truckNumber;

    public Truck(String truckDriver,int truckNumber)
    {
        this.truckDriver = truckDriver;
        this.truckNumber = truckNumber;
    }

    public static void main(String[] args) {
        Truck truck1 = new Truck("Sam",10);
        Truck truck2 = new Truck("Adam",20);
        System.out.println(truck1.truckDriver);
        System.out.println(truck1.truckNumber);
        System.out.println(truck2.truckDriver);
        System.out.println(truck2.truckNumber);
    }
}
