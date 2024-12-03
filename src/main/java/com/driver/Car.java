package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    private String type;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;  // Default gear
        this.seats = seats;
        this.type = type;
    }

     public void changeGear(int gear) {
        this.currentGear = gear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

 public void changeSpeed(int speed, int direction) {
    int gear;
    if (speed > 0 && speed <= 50) {
        gear = 1;
    } else if (speed <= 100) {
        gear = 2;
    } else if (speed <= 150) {
        gear = 3;
    } else if (speed <= 200) {
        gear = 4;
    } else if (speed <= 250) {
        gear = 5;
    } else {
        gear = 6;
    }
    changeGear(gear);
    super.move(speed, direction);
}
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public String getType() {
        return type;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}

