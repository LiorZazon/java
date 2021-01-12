package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Random r = new Random();


        int[] arr_int = new int[5];

        for (int index = 0; index < arr_int.length; index++) {
            arr_int[index] = r.nextInt(50) + 1;
        }


        // targil 12:
        System.out.println(8 % 2);

        int count = 0;
        for (int index = 1; index <= 5; index++) {
            int number = r.nextInt(50) + 1;
            System.out.println(number);
            if (number % 2 == 0) {
                System.out.println("zugi");
                count++;
            } else {
                System.out.println("e-zugi");
            }
        }

        if (count == 5) {
            System.out.println("all are even");
        } else {
            System.out.println("not all are even");

            // targil 13:

            int[] arrayA = new int[6];
            int[] arrayB = new int[6];

            if (arrayA != arrayB) {
                System.out.println("different");
            }
        }

        // targil 14:

        int[] secret_code = {9, 4, 6};

        int[] arr_empty = new int[3];

        for (int index = 0; index < arr_empty.length; index++) {
            System.out.println("please guess 3 numbers as the secret code");
            arr_empty[index] = s.nextInt();
        }

        if (secret_code == arr_empty) {
            System.out.println("Access Granted");
        } else {
            System.out.println("wrong");
        }

        // targil 15:

        String s1 = "hello"; // --> ['h','e','l','l','o'] == 5
        System.out.println(s1.length()); // 5

        System.out.println("Enter a word:");
        String word = s.nextLine();
        System.out.println(String.format("size of '%s' is %d", word, word.length()));

        //targil 16:

        String hello = "hello world!";
        int len = hello.length();
        String[] words = {"Hello", "world", "java", "", "tonight", "tomorrow"};
        int counter = 0;
        for (int index = 0; index < words.length; index++) {
            int length_of_word = words[index].length();
            counter += length_of_word;
        }
        System.out.println(String.format("Sum of characters: %d", counter));

        // targil 17:


        String[] names_of_students = new String[5];

        int[] grades = new int[5];

        for (int index = 0; index < names_of_students.length; index++) {
            System.out.println();
            names_of_students[index] = s.nextLine();
        }

        // targil 18:


        int[] arr = {9, 100, -10000, 49564, 123, 1};
        int max = arr[0];
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        System.out.println(String.format("Maximum is %d", max));
        System.out.println(String.format("Minimum is %d", min));


        // targil 19:

      /*  String[] arr_words = {"you", "must", "be", "amazing", "things", "are", "going", "great", "to", "you"};

        System.out.println("please guess one word");
        String user_word = s.nextLine();

        for (int index = 0; index < arr_words.length; index++)
        {
            System.out.println(arr_words[index]);
        }
        if (user_words == arr_words[index]){
            System.out.println();
        }*/

        // tirgul part 2:

        //targil 1:
        for (int index_main = 1; index_main <= 5; index_main++) {
            for (int index = 1; index <= 10; index++) {
                System.out.println(index);
            }


        }

        // targil 2:

        String[] arr_days_in_a_week = {"sunday", "monday", "Tuesday", "Wednesday","Thursday", "Friday", "saturday"};
        for (int index1 = 1; index1 <= 4; index1++) {
            for (int index = 0; index < arr_days_in_a_week.length; index++)
            {
                System.out.println(" ");
                System.out.print(arr_days_in_a_week[index]);
            }
        }


        // targil 3:

        

    }
}
