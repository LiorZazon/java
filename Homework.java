package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Please enter your name");

        java.util.Scanner my_scanner = new Scanner(System.in);
        String user_name = my_scanner.nextLine();

        System.out.println("Hello");
        System.out.println(user_name);
        System.out.println("What day is today?");

        java.util.Scanner day_of_the_week = new Scanner(System.in);
        String day = day_of_the_week.nextLine();

        System.out.println("today is");
        System.out.println(day);
        int player_level = 1;
        double date = 23.11;
        System.out.println(player_level);
        System.out.println(date);
        double size = 8.8876;
        boolean young = true;
        System.out.println(size);
        System.out.println(young);

        int targil1 = 785 * 231;

        float targil2 = 4.3f * 7.8f;

        char lettx = 'x';

        char letty = 'y';

        short xs = 1, ys = 2, zs = 3;

        xs = (short) (ys + zs);


    }
}
