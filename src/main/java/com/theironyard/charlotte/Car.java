package com.theironyard.charlotte;

/**
 * Created by temp on 12/20/16.
 */
public class Car {
    String carName;
    int carSize;
    int carCost;
    String lotChoice;

    public Car() {
    }

    public Car(String carName, int carSize, int carCost, String lotChoice) {
        this.carName = carName;
        this.carSize = carSize;
        this.carCost = carCost;
        this.lotChoice = lotChoice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarSize() {
        return carSize;
    }

    public void setCarSize(int carSize) {
        this.carSize = carSize;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public String getLotChoice() {
        return lotChoice;
    }

    public void setLotChoice(String lotChoice) {
        this.lotChoice = lotChoice;
    }

    @Override
    public String toString() {
        return getCarName();
    }
}
