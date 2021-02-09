package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car lamborghini = new Car("italian", "sport car", 2020, 4.6, 4000000);

        Car ferrari = new Car("italian", "sport car");

        System.out.println(ferrari);
        System.out.println(lamborghini);

        Television samsung = new Television("samsung", "smart tv", 4450.56, "yes", 55.40);
        System.out.println(samsung);
    }
}
