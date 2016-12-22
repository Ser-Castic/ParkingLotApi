package com.theironyard.charlotte;


import java.util.ArrayList;

/**
 * Created by temp on 12/20/16.
 */
public class Lot {
    String id;
    int capacity;
    int cost;
    //boolean handicapSign;
    ArrayList<Car> car = new ArrayList<>();

    public Lot(String id, int capacity, int cost, ArrayList<Car> car) {
        this.id = id;
        this.capacity = capacity;
        this.cost = cost;
        this.car = car;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

//    public boolean isHandicapSign() {
//        return handicapSign;
//    }
//
//    public void setHandicapSign(boolean handicapSign) {
//        this.handicapSign = handicapSign;
//    }


    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public void addCarToLot (Car currentCar) {
        car.add(currentCar);
    }
}
