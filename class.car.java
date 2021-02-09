package com.company;

public class Car {

    //fields
    public String brand;
    public String model;
    public int year;
    public double weight;
    public int price;

    public Car(String brand, String model, int year, double weight, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.price = price;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
