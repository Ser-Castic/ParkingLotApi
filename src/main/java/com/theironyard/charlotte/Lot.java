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
    ArrayList<Car> addCar = new ArrayList<>();

    public Lot(String id, int capacity, int cost, ArrayList<Car> addCar) {
        this.id = id;
        this.capacity = capacity;
        this.cost = cost;
        this.addCar = addCar;
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

    public ArrayList<Car> getAddCar() {
        return addCar;
    }

    public void setAddCar(ArrayList<Car> addCar) {
        this.addCar = addCar;
    }
}
