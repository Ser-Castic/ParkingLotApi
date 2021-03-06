package com.theironyard.charlotte;

import com.google.gson.Gson;
import spark.Spark;

import java.util.ArrayList;


public class Main {
    private static Gson gson = new Gson();
    private static ArrayList<Lot> lotInventory = new ArrayList<>();

    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");

        });

        lotInventory.add(new Lot("BFE", 15, 5, new ArrayList<>()));
        lotInventory.add(new Lot("C2", 30, 15, new ArrayList<>()));
        lotInventory.add(new Lot("Paved Paradise", 50, 30, new ArrayList<>()));
        lotInventory.add(new Lot("Handicap Parking", 10, 100, new ArrayList<>()));


        Spark.get("/lot", ((request, response) -> {
            System.out.println("User is asking for current Lots");
            return gson.toJson(lotInventory);
        }));

        Spark.post("/addCar", ((request, response) -> {
            Car parkRequest = null;
            try {
                parkRequest = gson.fromJson(request.body(), Car.class);
            } catch (Exception Ex) {
                Ex.printStackTrace();
            }
            System.out.println("Car is trying to park");
            //System.out.println(parkRequest);

            switch (parkRequest.getLotChoice()) {
                case "BFE":
                    if (parkRequest.getCarCost() >= lotInventory.get(0).cost && lotInventory.get(0).capacity - parkRequest.getCarSize() >= 0) {
                        lotInventory.get(0).addCarToLot(parkRequest);
                        System.out.println("New Car was added to BFE");
                        lotInventory.get(0).setCapacity(lotInventory.get(0).getCapacity() - parkRequest.getCarSize());
                    }
//                    return lotInventory.get(0).toString();
                    //break;
                case "C2":
                    if (parkRequest.getCarCost() >= lotInventory.get(1).cost && lotInventory.get(1).capacity - parkRequest.getCarSize() >= 0) {
                        lotInventory.get(1).addCarToLot(parkRequest);
                        System.out.println("New Car was added to C2");
                        lotInventory.get(1).setCapacity(parkRequest.getCarSize() - lotInventory.get(1).getCapacity());
                    }
                    break;
                case "Paved Paradise":
                    if (parkRequest.getCarCost() >= lotInventory.get(2).cost && lotInventory.get(2).capacity - parkRequest.getCarSize() >= 0) {
                        lotInventory.get(2).addCarToLot(parkRequest);
                        System.out.println("New Car was added to Paved Paradise");
                        lotInventory.get(2).setCapacity(parkRequest.getCarSize() - lotInventory.get(2).getCapacity());
                    }
                    break;
                case "Handicap Parking":
                    if (parkRequest.getCarCost() >= lotInventory.get(3).cost && lotInventory.get(3).capacity - parkRequest.getCarSize() >= 0) {
                        lotInventory.get(3).addCarToLot(parkRequest);
                        System.out.println("New Car was added to Handicap Parking");
                        lotInventory.get(3).setCapacity(parkRequest.getCarSize() - lotInventory.get(3).getCapacity());
                    }
                    break;
                default:
                    break;
            }
            response.redirect("/lot");
            return "";
        }));
    }
}
