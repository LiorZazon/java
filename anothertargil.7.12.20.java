package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a: ");
        int a = s.nextInt();
        System.out.println("please enter b: ");
        int b = s.nextInt();

        if (a == b) {
            System.out.println("a equals b");
        }
        if (a != b) {
            System.out.println("a is NOT equals b");
            //etgar:
            if (a > b) {
                b = a;
            }
            if (b > a) {
                a = b;
            }

            System.out.println("please enter num1: ");
            int num1 = s.nextInt();
            System.out.println("please enter num2: ");
            int num2 = s.nextInt();

        /*if (num1 < 0) {
            if (num2 < 0) {
                System.out.println("cannot have 2 negatives");
            }
        } */
            if (a < 0 && b < 0){
                System.out.println("both a and b are negatives");
            }

        }
    }
    }
