package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //    1. Define Scanner in Main scope
    static Scanner s = new Scanner(System.in);
    //    2. Define Random in Main scope
    static Random r = new Random();

    public static void main(String[] args) {
	// write your code here

    /*    3. Create a function getString which gets a String msg as parameter and resturns a String
        println (msg)
        return a string input from the user (use Scanner)*/
        String fname = getString ("please enter your first name");
    //    4. Create a function howManyDigits which gets an int as parameter and returns the number of digits (int)
    //    i.e. howManyDigits(985) -> will return 3
    //    i.e. howManyDigits(12343) -> will return 5
        
    //            **etgar : add another function with the same name (overloading) change the function output to return a String and get a float parameter and print digit before and after digit
    //    i.e. howManyDigits(5.444) -> will return *.***
    //    i.e. howManyDigits(235.4) -> will return ***.**/
    /*    5. Create a function isLonger which gets an int[] arr and int len and return true if the array length is bigger than len
        i.e. int[] arr = {1,2,3,4}
        isLonger(arr, 5) -> will return false
        isLonger(arr, 4) -> will return false
        isLonger(arr, 3) -> will return true
        create overloading for float[] and int len ...*/
        int[] arr = { 1,2,3,4};
        System.out.println(isLonger(arr , 4));

        System.out.println(isNumberInsideArray(arr, 5));
    /*    6. Create a function arrayEqual which gets int[] , int[] and return trueif both arrays are equal in size and content
        i.e. int[] arr1 = {1,2,3,4}
        int[] arr2 = {1,2,3,4}
        arrayEqual (arr1, arr2) -> will return true
        i.e. int[] arr1 = {1,2,3,4}
        int[] arr2 = {1,2,3}
        arrayEqual (arr1, arr2) -> will return false
        i.e. int[] arr1 = {1,2,3,4}
        int[] arr2 = {4,3,2,1}
        arrayEqual (arr1, arr2) -> will return false */

    }

    private static String getString(String msg) {
        System.out.println(msg);
        String user_msg = s.nextLine();
        return user_msg;
    }

    private static int howManyDigit() {
        String number_as_string = String.valueOf(number);
        return number_as_string.length();

    }
    private static boolean isNumberInsideArray(int[] arr, int number)
    {
        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] == number) {
                return true;
            }
        }
        return false;
    }
    private static boolean isLonger(int[] numbers, int len) {
        return numbers.length > len;
    }
    private static boolean arrayEqual(int[] numbers1, int[] numbers2) {
        if (numbers1.length != numbers2.length) {
            return false;
        }
        for (int index = 0; index < numbers1.length; index++) {
            if (numbers1[index] != numbers2[index]) {
                return false;
            }
        }
        return true;
    }
}
