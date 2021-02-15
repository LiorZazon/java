package com.company;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        // targil 1:
        /* פונקציה מתחילה במילים
        public/private static void theFunctionName () {}
        בתוך הסקופ של הפונקציה {} ניתן לרשום קוד שבו אפשר להתשמש מאוחר יותר בכל קטע בתוכנית על ידי זימון הפונקציה
        הסיבות שבגללן כדאי להשתמש בפונקציות: קוד מודולרי, לא ארוך, ברור להבנה, חלוקה לאיזורים בקוד, קל לתחזק את הקוד - לתקן ולמצוא בעיות בקוד לפי פונקציה,
        קיצור התוכנית על ידי כך שכאשר אנו רוצים לחזור ולהשתמש באותו קוד כמה פעמים פשוט נרשום את הקוד הזה בתוך פונקציה ונשתמש באותה
        פונקציה כמה פעמים שנצטרך בלי לחזור ולכתוב את הקוד שוב ושוב
         */

        // targil 2:
        // public static void main (String[] args) {}

        // targil 3:
        greet();

        // targil 4:
        printNum(5);

        // targil 5:
        printNum(1);
        printNum(2);
        printNum(3);
        printNum(4);
        printNum(5);
        printNum(6);
        printNum(7);
        printNum(8);
        printNum(9);
        printNum(10);

        // targil 6:

        int k = 5;
        changeNumber(k);

        // targil 7:

        multiply(7, 5);
        multiply(3, 6);
        multiply(5, 4);

        // targil 8:

       calc(2, 3, '+');

        // targil 9:

        float avg = getThreeNumbersReturnsAvg(6, 5, 8);
        System.out.println(avg);

        // targil 10:

        int[] my_arr = {6, 9, 23, 50};

        boolean check_number = getArrayAndCheckIfTheNumberIsInTheArray(my_arr, 6);
        System.out.println(check_number);

        // targil 11:

        //do it later

        // targil 12:

        hello("hello");

        // targil 13:

        // כאשר נרצה להשתמש באותה פונקציה לטיפוסים שונים

        // targil 14:

        numberType(6);
        numberType(0.2);
        numberType(5.6f);

        // targil 15:
        // אתגר

        // targil 16:




    }
    //3
    public static void greet() {
        System.out.println("good morning!");
    }
    //4
    public static void printNum(int number) {
        System.out.println(number);
    }
    //6
    public static void changeNumber(int x) {
        x++;
        System.out.println(x);
    }
    //7
    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    //8
    public static void calc(int num1, int num2, char action) {

        if (action == '+') {
            System.out.println(num1 + num2);
        }
        else if (action == '-') {
            System.out.println(num1 - num2);
        }

    }
    //9
    private static int getThreeNumbersReturnsAvg(int number1, int number2, int number3) {
        int avg = ((number1 + number2 + number3)/3);
        return avg;
    }
    //10
    private static boolean getArrayAndCheckIfTheNumberIsInTheArray(int[] arr, int num) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        for (int index = 0; index < arr.length; index++) {
            if (num == index) {
                System.out.println("true");
            }
            else {
                System.out.println("flase");
            }
        }
        return false || true;
    }
    //11
    private static void divisionOfNumber (int number) {

    }
    //12
    private static void hello(String word) {
        System.out.print("hello ");
        world("world");

    }
    private static void world(String word1) {
        System.out.println("world");
    }
    //14

    private static void numberType(int a) {

    }
    private static void numberType(float b) {

    }
    private static void numberType(double c) {

    }

    //15

    /*private static Scanner getScanner (Scanner s) {
        int user = s.nextInt();
        return user;
    }*/

    //16

   // private static int randomize(int[] arr) {
   //     int random_number = r.nextint(arr[index]);
   //     return random_number;
   // }

    //17
    
        // targil 17:

    public static void addSulamit(){
        System.out.println("#");
    }
    public static void add2Kohaviot(){
        System.out.println("**");
    }
    public static void getString(String shtrudel) {
        System.out.println("@@@");
        add2Kohaviot();
        addSulamit();
    }

    //targil 18:

    // משתנה גלובלי הוא משתנה שמוגדר לפני ה-main וכך גם main וגם פונקציות אחרות יכולות לגשת אליו,
    // משתנה שיוגדר בתוך main לא ניתן יהיה לגשת אליו מפונקציות אחרות באותה תוכנית אלא רק באזור הסקופ שלו.


}
