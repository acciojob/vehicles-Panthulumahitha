package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating and testing a Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: " + vehicle.getName());

        // Creating and testing a Car
        Car car = new Car("Sports Car", 4, 4, 5, true, "Sedan", 5);
        System.out.println("Car Name: " + car.getName());
        car.changeGear(3);
        car.changeSpeed(80, 30);

        // Creating and testing an F1 car
        F1 f1 = new F1("Formula 1", false);
        System.out.println("F1 Car Name: " + f1.getName());
        f1.accelerate(120);
        f1.accelerate(50);

        // Creating and testing a Boat
        Boat boat = new Boat("Speedboat", 15);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity() + " people");
    }
}
