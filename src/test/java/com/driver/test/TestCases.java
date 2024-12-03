package com.driver;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testVehicle() {
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        assertEquals("Generic Vehicle", vehicle.getName());

        vehicle.move(60, 30);
        assertEquals(60, vehicle.getCurrentSpeed());
        assertEquals(30, vehicle.getCurrentDirection());

        vehicle.steer(15);
        assertEquals(45, vehicle.getCurrentDirection());

        vehicle.stop();
        assertEquals(0, vehicle.getCurrentSpeed());
    }

    @Test
public void testCar1() {
    Car car = new Car("Sports Car", 4, 4, 5, true, "Sedan", 5);
    assertEquals("Sports Car", car.getName());
    assertEquals(4, car.getWheels());
    assertEquals(4, car.getDoors());
    assertEquals(5, car.getSeats());
    assertTrue(car.isManual());
    assertEquals("Sedan", car.getType());
    assertEquals(1, car.getCurrentGear());  // Check initial gear
}

    @Test
    public void testF1() {
        F1 f1 = new F1("Formula 1", false);
        assertEquals("Formula 1", f1.getName());

        f1.accelerate(120);
        assertEquals(120, f1.getCurrentSpeed());
        assertEquals(2, f1.getCurrentDirection());

        f1.accelerate(-50); // Decelerate
        assertEquals(70, f1.getCurrentSpeed());
    }

    @Test
    public void testBoat() {
        Boat boat = new Boat("Speedboat", 15);
        assertEquals("Speedboat", boat.getVehicleName());
        assertEquals(15, boat.getVehicleCapacity());
    }
}
