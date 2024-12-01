package com.driver;

public class Main {
    public static void main(String[] args) {
        // Creating and testing a Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        System.out.println("Vehicle Name: " + vehicle.getName());

        // Creating and testing a Car
        Car car = new Car("Sports Car", 180);
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Speed: " + car.getSpeed() + " km/h");

        // Creating and testing an F1 car
        F1 f1 = new F1("Formula 1", 320, "Red Bull");
        System.out.println("F1 Car Name: " + f1.getName());
        System.out.println("F1 Car Speed: " + f1.getSpeed() + " km/h");
        System.out.println("F1 Team: " + f1.getTeam());

        // Creating and testing a Boat
        Boat boat = new Boat("Speedboat", 15);
        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity() + " people");
    }
}
