package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
    /*    home work:
        1. input array size from user
        create int array in the given size
        populate the array with random numbers
        sum the array
        print the average number*/
        System.out.println("please enter array size: ");
        int array_size = s.nextInt();
        int [] arr_rnd = new int[array_size];
        for (int index = 0; index < arr_rnd.length; index++)
        {
            arr_rnd[index] = r.nextInt(array_size);
        }
        int sum = 0;
        for (int index = 0; index < arr_rnd.length; index++)
        {
            sum = sum + arr_rnd[index];
        }
        float avg = sum / arr_rnd.length;
        System.out.println(avg);
        for (int index = 0; index < arr_rnd.length; index++)
        {
            System.out.println(arr_rnd[index]);
        }


    /*    2. create an array of 5 Strings (hint: String[] word = new String[5])
        create a for loop and input words from the user into the array
        now print the array in a for loop
                *** etgar: print the average length of the words, i.e.  hello java book pro about. the words length is  [5,4,4,3,5] => average=4.2*/
        String[] words = new String[5];
        for (int index = 0; index < words.length; index++)
        {
            words[index] = s.nextLine();
        }
        for (int index = 0; index < words.length; index++)
        {
            System.out.println(words[index]);
        }

      /*  3. create int array A with random numbers (size of 5)
        create int array B with random numbers (size of 5)
        create int array C (size of 5) which each element will be the sum of A+B
        for exmaple:
        A [ 5, 8, 6, 2, 3]  -- random
        B [ 3, 7, 8, 3, 1]  -- random
        C [ 8,15,14, 5, 4]  -- sum*/
        int[] arrayA = new int[r.nextInt(5) + 1];
        int[] arrayB = new int[r.nextInt(5) + 1];
        int[] arrayC = new int [5];
       // int array_sum = פה נתקעתי אשמח להסבר.
        
        
        /*        *etgar: create int array D which will contain the larger name from A or B
                *D[ 5, 8, 8, 3, 3]
            *etgar: create in array E which will be concat of the array A and B
            *E[ 5, 8, 6, 2, 3, 3, 7, 8, 3, 1]
        3. ***etgar crazy:
        input number of classes from user
        for each size input number of students
        input all numbers from user
        calculate the average of each class in an array
                calculate the average of averages */

    }
}
