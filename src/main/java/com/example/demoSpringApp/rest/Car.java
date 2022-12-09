package com.example.demoSpringApp.rest;

public class Car {
    private String brand;
    private String model;
    private CarType type;
    private Popularity popularity;

    public Car(String brand, String model, CarType type, Popularity popularity) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.popularity = popularity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
