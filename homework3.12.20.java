package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
             /* Targil:
    1. print "Please enter temperature"
    2. input from user a float number into variable called "temperature" (nextFloat)
    3. if temperature is higher than 36.5
    print "Hot"
    4. if temperature is lower than 36.5
    print "Cold"
    5. print "please enter your age"
    6. input from user an int number into variable called "my_age" (nextInt)
    7. if age is bigger than 18
    print "Grown up"
    8. if age is smaller than 13
    print "Child"
    9. print "Please enter number for a"
    10. input from user a double number into variable called "a" (nextDouble)
    11. print "Please enter number for b"
    12. input from user a double number into variable called "b" (nextDouble)
    13. if a > b
    print "a is bigger"
    print a
    14. if a < b
    print "b is bigger"

              */
        System.out.println("Please enter temperature");
        Scanner s = new Scanner(System.in);
        float temperature = s.nextFloat();

        if (temperature >= 36.5)
            System.out.println("Hot");

        if (temperature <= 36.5)
            System.out.println("Cold");

        System.out.println("please enter your age");
        int my_age = s.nextInt();

        if (my_age >= 18)
            System.out.println("Grown up");

        if (my_age <= 13)
            System.out.println("Child");

        System.out.println("Please enter number for a");
        double a = s.nextDouble();

        System.out.println("Please enter number for b");
        double b = s.nextDouble();

        if (a > b)
            System.out.println("a is bigger");

        if (a < b)
            System.out.println("b is bigger");

    }
}
