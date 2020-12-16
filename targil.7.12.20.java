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
        System.out.println("please enter c: ");
        int c = s.nextInt();

        if (c > b && c > a) {
            System.out.println("c is the biggest");
        }
        System.out.println("please enter d: ");
        int d = s.nextInt();
        System.out.println("please enter e: ");
        int e = s.nextInt();
        System.out.println("please enter f: ");
        int f = s.nextInt();

        if (!(d >= e || d >= f)){
            System.out.println("d is not the smallest");

        }
    }
}
