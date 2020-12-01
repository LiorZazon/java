package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    /*  create variable my_name (String)
    use scanner to get the name from the user

     create variable named my_savings (int or long)
    put 0 in my_savings
    add 10000 to my_savings
    multiply my_savings by 2
    add 30000 to my_savings
    add 1 to my_savings
    divide my_savings in half
    -- all this math operations should be in shorten format!
    print in one line -- [my_name] has saving of [my_savings]
    what was the amount?
    run in debugger
    change user name to Bill Gates before the print
    change my_savings to start in 100000 instead of 0
    -- what was the final amount this time?*
     */

        Scanner s = new Scanner(System.in);
        System.out.println("please enter your name!");
        String my_name = s.nextLine();
        long my_savings = 0;
        my_savings += 10000;
        my_savings *= 2;
        my_savings += 30000;
        my_savings++;
        my_savings /= 2;
        System.out.println(my_name + " " + "has saving of " + my_savings + " ");
        System.out.print(my_savings);






}

}

