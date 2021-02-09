package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Television {

    public String brand;
    public String model;
    public double price;
    public String is4k;
    public double size;

    //function

    public void showPriceAfterDiscount () {
        System.out.println(price / 2);
    }

    //public Television(String brand, String model, double price, String is4k, double size) {
    //    this.brand = brand;
    //    this.model = model;
    //    this.price = price;
    //    this.is4k = is4k;
    //    this.size = size;
   // }

    //@Override
    //public String toString() {
    //    return "Television{" +
    //            "brand='" + brand + '\'' +
    //            ", model='" + model + '\'' +
    //            ", price=" + price +
    //            ", is4k=" + is4k +
   //             ", size=" + size +
    //            '}';
   // }
}
