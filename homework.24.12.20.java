package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Random r = new Random();

       //-- targilim:
       // 1. create an array of double numbers with these numbers: 0.9, -6.5555, 3.24, 10.11, 20.35
       double[] arr_numbers = {0.9, -6.5555, 3.24, 10.11, 20.35};
       // 1.1. print the first element
        System.out.println(arr_numbers[0]);
       // 1.2. print the last element
        System.out.println(arr_numbers[4]);
       // 1.3. print the middle element
        System.out.println(arr_numbers[2]);
        //another way to solve:
        System.out.println(arr_numbers [arr_numbers.length -1]); //last
        System.out.println(arr_numbers[arr_numbers.length / 2]); //middle
       // 1.4. write a for loop which prints all the element in the array
        for (int index = 0; index < arr_numbers.length; index++){
            System.out.println(arr_numbers[index]);
        }
       // 1.5. write a for loop which prints all the element in the array in reverse
        for (int index1 = 4; index1 > arr_numbers.length; index1--){
            System.out.println(arr_numbers[index1]);
        }
        //another way and a better one for longest arrays
        for (int index1 = arr_numbers.length -1; index1 >= 0; index1--){
            System.out.println(arr_numbers[index1]);
        }
       // 1.6. use scanner to read a double number from the user. print all the elements
       // in the array which are bigger than the user-number
        System.out.println("enter a number: ");
        double user_number = s.nextDouble();
        if (arr_numbers[index1] > user_number){
            System.out.println(arr_numbers[index1]);
        }


       // 2. create an array A of integer numbers with these numbers: 4, 10, 20, 40, 1000
        int[] arrayA = {4, 10, 20, 40, 1000};
       // 2.1. create a second array B with these numbers: 0, 0, 0, 0, 0
        int[] arrayB = {0, 0, 0, 0, 0};
       // 2.2. copy all elements from A to B
        for (int index = 0; index < arr_numbers.length; index++){
            arrayB[index] = arrayA[index]
        }


    }
}
