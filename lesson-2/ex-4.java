package com.mycompany.ex.java;

interface Vehicle {
    Vehicle changeSpeed(int value);
    Vehicle fillFuel(int value);
}

class Truck implements Vehicle {
    
    private final String brand;
    private final int capacity;
    private final int speed;
    private final int fuelTankCapacity;
    
    Truck(String brand, int speed, int capacity, int fuelCapacity) {
        this.brand = brand;
        this.capacity = capacity;
        this.speed = speed;
        this.fuelTankCapacity = fuelCapacity;
    }
    
    @Override
    public Vehicle changeSpeed(int value) {
        return new Truck(brand, value, capacity, fuelTankCapacity );
    }
    
    @Override
    public Vehicle fillFuel(int value) {
        return new Truck(brand, speed, capacity, fuelTankCapacity+value );
    }
    
    void printSpeed() {
        System.out.printf("Vehicle is moving with speed: "+speed);
    }
}

class Boat implements Vehicle {
    
    private final String brand;
    private final int passengersAmount;
    private final int speed;
    private final int fuelTankCapacity;
    
    Boat(String brand, int speed, int passengersAmount, int fuelCapacity) {
        this.brand = brand;
        this.passengersAmount = passengersAmount;
        this.speed = speed;
        this.fuelTankCapacity = fuelCapacity;
    }

    @Override
    public Vehicle changeSpeed(int value) {
        return new Boat(brand, value, passengersAmount, fuelTankCapacity );
    }

    @Override
    public Vehicle fillFuel(int value) {
        return new Boat(brand, speed, passengersAmount, fuelTankCapacity+value );    
    }
    
    Boat addPassenger() {
        return new Boat(brand, speed, passengersAmount+1, fuelTankCapacity );    
    }
    
}

public class Ex4Java {

    public static void main(String[] args) {
        Truck truck = new Truck("Man", 0,10,30);
        truck.printSpeed();
        Truck runningTruck = truck.changeSpeed(80); //com/mycompany/ex/java/Ex4Java.java:[77,47] incompatible types: com.mycompany.ex.java.Vehicle cannot be converted to com.mycompany.ex.java.Truck
        truck.printSpeed();
        
        Boat boat = new Boat("Ford", 10,1,30);
        Boat transportingBoat = boat.addPassenger();
    }
}
