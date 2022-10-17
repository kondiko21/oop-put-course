
package com.mycompany.zadanie_2;

final class Car {
    
    int maxSpeed;
    int productionYear;
    int mileage;
    
    Car(int speed, int productionYear, int mileage) {
        this.maxSpeed = speed;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }
    
    Car(int speed, String productionYear, int mileage) {
        this(speed, Integer.parseInt(productionYear), mileage);
    }
    
    Car(String speed, String productionYear) {
        this(Integer.parseInt(speed), Integer.parseInt(productionYear), 0);
    }
    
    void printCarInfo() {
        System.out.println("Max speed: "+maxSpeed+", Production year: "+productionYear+", Mileage: "+mileage);
    }
    
}

public class Zadanie_2 {

    public static void main(String[] args) {
        
        Car firstCar = new Car(120, 2001, 50000);
        firstCar.printCarInfo();
        Car secondCar = new Car(150, "2014", 12000);
        secondCar.printCarInfo();
        Car thirdCar = new Car("200", "2010");
        thirdCar.printCarInfo();
        
    }
}
