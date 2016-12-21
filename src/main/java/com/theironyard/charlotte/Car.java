package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by temp on 12/20/16.
 */
public class Car extends ArrayList<Car> {
    String carName;
    int carWeight;
    int carCost;
    String lotChoice;


    public Car(String carName, int carWeight, int carCost, String lotChoice) {
        this.carName = carName;
        this.carWeight = carWeight;
        this.carCost = carCost;
        this.lotChoice = lotChoice;
    }

    public String getLotChoice() {
        return lotChoice;
    }

    public void setLotChoice(String lotChoice) {
        this.lotChoice = lotChoice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }


}
