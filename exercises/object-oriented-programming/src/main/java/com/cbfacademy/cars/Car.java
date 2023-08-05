package com.cbfacademy.cars;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make,String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    
    public String details(){
        String output = String.format("a %s %s from %s", this.make,this.model,this.year);
        return output;
    }
}
