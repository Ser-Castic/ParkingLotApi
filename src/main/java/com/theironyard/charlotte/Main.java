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
        lotInventory.add(new Lot("CM2", 30, 15, new ArrayList<>()));
        lotInventory.add(new Lot("Paved Paradise", 50, 30, new ArrayList<>()));
        lotInventory.add(new Lot("Handicap Parking", 10,100, new ArrayList<>()));


        Spark.get("/lots", ((request, response) -> {
            System.out.println("User is asking for current Lots");
            return gson.toJson(lotInventory);
        }));
    }
}
