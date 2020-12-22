package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    1. write for-loop which prints the numbers from 100 to 1000 in 100 steps: 100, 200, 300, .... 1000
    //  Scanner s = new Scanner(System.in);

        for (int index = 100; index <= 1000; index = index + 100){
            System.out.println(index);
        }
    //    2. write for-loop which prints numbers from 5 to -10 (minus)
        for (int index1 = 5; index1 >= -10; index1 = index1 - 1){
            System.out.println(index1);
        }
    //    3. *etar: use for-loop to print the power of 2: 1, 2, 4, 8, 16, 32, 64, ... 2048
        for (int index2 = 1; index2 <= 2048; index2 = index2 * 2){
            System.out.println(index2);
        }
    //    4. generate a random number from 1-3
    //    use switch-case to print the number in hebrew.
    //    for exmaple if 1 was generated -> print "ehad", 2 -> print "shtaim" , 3 -> print "shalosh"
        Random r = new Random();
        int random_num = r.nextInt(3) + 1;
        System.out.println(random_num);
        switch (random_num){
            case 1:
            System.out.println("ehad");
            break;
            case 2:
                System.out.println("shtaim");
                break;
            case 3:
                System.out.println("shalosh");
                break;

        }

    }
}
