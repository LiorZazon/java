package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Targil:
        //1. input two int numbers from the user a, b
        //print a > b, or a < b or a == b
        //for example, if a = 3 and b = 4:
        //print "3 < 4"
        //for example, if a = 7 and b = 1:
        //print "7 > 1"
        //for example, if a = 9 and b = 9:
        // print "9 == 9"
        // 2. write a loop which prints all the numbers from 5 to 10
        //3. write a loop which inputs a number from the user until a number bigger than 100 is given
        //4. *etgar: print all the even numbers from 4 to 100.
        //should be like: 4, 6, 8, 10, ... 100
        //5. *etgar: input two numbers from the user until the two numbers are the same
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a: ");
        int a = s.nextInt();
        System.out.println("please enter b: ");
        int b = s.nextInt();

        //    System.out.println(String.format("%d > %d",a ,b));
        //System.out.println(String.format("%d < %d",a, b));
        //System.out.println(String.format("%d == %d",a, b));
        System.out.println(a);
        System.out.println(">");
        System.out.println(b);
        if (a == b) {
            System.out.println(a);
            System.out.println(" == ");
            System.out.println(b);
            System.out.println(String.format("%d == %d", a, b));
        } else if (a > b) {
            System.out.println(String.format("%d > %d", a, b));
        } else {
            System.out.println(String.format("%d < %d", a, b));
        }
        int index = 5;
        while (index < 11) {
            System.out.println(index);
            index = index + 1;
        }
        System.out.println("enter a number");
        int answer = s.nextInt();

        while (answer < 100) {
            System.out.println("try again");
            answer = s.nextInt();
//etgar 1
            int index4 = 4;
            while (index4 <= 100) {
                System.out.println(index4);
                index4 += 2;
            }
            //etgar 2
            System.out.println("enter two equal integer numbers: ");
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            while (num1 != num2) {
                System.out.println("enter two equal integer numbers: ");
                num1 = s.nextInt();
                num2 = s.nextInt();
            }
        }

    }
}

