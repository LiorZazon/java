package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        wakeUpInTheMorning();
        GoToCar();
        driveToWork();
        goToDinner();
        goToMovie();
        goToSleep();

        xIsTwenty();

        // 1 extract methods auto for all except 1
        // 1.1 write yourslef one method
        // 2. add println inside ach method (be original)
        // 3. debug using step over and step into
        // 4. inside main write 3 lines of code , for example
        //     input a number and print it
        //     then ... select the 3 lines of code
        //     and extract a methods from them...
        Scanner s = new Scanner(System.in);


    }

    private static void xIsTwenty() {
        int x = 12;
        System.out.println(x);
        x = 20;
    }

    private static void goToSleep() {
        System.out.println("its time to sleep, good night.");
    }

    private static void goToMovie() {
        System.out.println("would you come to the movies with me?");
        Scanner s = new Scanner(System.in);
        String date = s.nextLine();
        System.out.println("I will pick you up at 20:00.");

    }

    private static void goToDinner() {
        System.out.println("we were invited to dinner at the Rubbinsons");
    }

    private static void driveToWork() {
        System.out.println("you have to go to work, im staying home.");
    }

    private static void GoToCar() {
        System.out.println("get in the car, now!!!");
    }

    private static void wakeUpInTheMorning() {
        System.out.println("wake up in the morning feelin' like P. Diddy");
    }

}

