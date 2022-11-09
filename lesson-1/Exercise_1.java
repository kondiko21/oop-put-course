

package com.mycompany.zadanie_1;

class Person {
    String firstName;
    String secondName;
    int age;
    
}

final class Driver extends Person {
    String licenseExpirationDate;
    String category;
}

final class Car {
    int speed;
    String color;
    String brand;
    Driver driver;
    Person passenger;

    
    void drive() {
        System.out.print("Car is driving with speed: "+speed);
    }
}

public class Zadanie_1 {

    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.speed = 120;
        myCar.brand = "Opel";
                
        Driver firstDriver = new Driver();
        firstDriver.firstName = "Jan";
        firstDriver.secondName = "Kowalski";
        firstDriver.age = 20;
        firstDriver.licenseExpirationDate = "2022-09-22";
        firstDriver.category = "B";
        
        myCar.driver = firstDriver;
        
        Person passenger = new Person();
        passenger.firstName = "Anna";
        passenger.secondName = "Nowak";
        
        myCar.passenger = passenger;
        
        myCar.drive();
                
        
        
    }
}
