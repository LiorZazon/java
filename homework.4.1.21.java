package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        // Targil:
        
        //1. Create a function that prints "hello world" , call it from main
        helloWorld();
        
        //2. Create a function that prints all numbers from 1 to 100, call it from main
        allNumbersFromOneToHundred();
        
        //3. Create a function that inputs a number and prints if the number is even (zugi) or not, call it from main
        ezugiOrZugi(s);
        
        //4. **etgar: input the number from main instead of inside the function
        
        //5. what is the difference betwene "step over" and "step into" ?
        // step over is you see the title of the function but dont go into detail of the function you skip it.
        // step in - you see every move the program do.
        
        //6. if you define int x inside main and int x inside a function , it is the same x? why?
        // no its a different x cause the first x belong to main and the other x belong to the function as long
        // they are not on the same section they are not the same.
        
        //7. ***etgarCreate function A() and call it from main, inside function A() call function B(), inside function B() call function A()
        //   what happend? why do you think?

    }

    private static void ezugiOrZugi(Scanner s) {
        System.out.println(8 % 2);

        int count = 0;
        System.out.println("please enter a number: ");
        int number = s.nextInt();

        if (number % 2 == 0){
            System.out.println("zugi");
            count++;

        }
        else {
            System.out.println("e-zugi");
        }
    }

    private static void allNumbersFromOneToHundred() {
        for (int index = 1; index <= 100; index++)
        {
            System.out.println(index);
        }
    }

    private static void helloWorld() {
        System.out.println("hello world");
    }
}
