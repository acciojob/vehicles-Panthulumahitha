package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 1, 6, isManual, "Race Car", 1);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed <= 250) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    // Override getCurrentGear if needed (if F1-specific)
    @Override
    public int getCurrentGear() {
        return super.getCurrentGear();
    }

    // Optional: Additional F1-specific getter methods if needed
}

