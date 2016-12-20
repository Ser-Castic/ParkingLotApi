package com.theironyard.charlotte;

import spark.Spark;

public class Main {

    public static void main(String[] args) {

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        Spark.get("/", ((request, response) -> "Hello, Sam!"));
    }
}
