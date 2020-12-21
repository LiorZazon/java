package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Targilim:
        //1. write all numbers from -1000 to +1000 using do-while loop
        Scanner s = new Scanner(System.in);

        int numbers = -1000;
        do {
            System.out.println(numbers);
            numbers++;
        }
        while (numbers < 1000);
        //2. read oreh,rohav,hekef from user until the hekef was 2*oreh+2*rohav using do-while loop
        //   for exmaple:
        //   oreh=3, rohav=4, hekef=12 is wrong, since 3*2 + 4*2 = 14... so the user should input the numbers again
        //   oreh=1, rohav=5, hekef=12 is correct since 1*2 + 5*2 = 12... so the loop should end after this input
        int oreh, rohav, hekef;
        do {
            System.out.println("please enter oreh, rohav and hekef: ");
            oreh = s.nextInt();
            rohav = s.nextInt();
            hekef = s.nextInt();
        }
        while (hekef != (rohav * 2 + oreh * 2));
        //3. now solve targil 1,2 to using while(true)+break loop
        int numberss = -1000;
        do {
            System.out.println(numberss);
            if (numberss == 1000) {
                break;
            }
            numberss++;
        }
        while (true);


        int orehh, rohavv, hekeff;
        do {
            System.out.println("please enter oreh, rohav and hekef: ");
            orehh = s.nextInt();
            rohavv = s.nextInt();
            hekeff = s.nextInt();
            if (hekeff == (rohavv * 2 + orehh * 2)) ;
            break;
        }
        while (true);
        //4. read temperature from user (float)
        float temperature;
        do {
            System.out.println("please enter temperature(f)");
            temperature = s.nextFloat();
            if (temperature < 35) {
                System.out.println("out of range");
                break;
            }

            if (temperature > 42) {
                System.out.println("out of range");
                break;
            }
            if (temperature > 37.5 && temperature <= 42) {
                System.out.println("sick");
            }
            if (temperature > 35 && temperature <= 37.5) {
                System.out.println("healthy");
            }
        }
            while (true);
            //   if temperature < 35 print "out-of-range" + break
            //   if temperature > 42 print "out-of-range" + break
            //   if temperature > 37.5 and temperature <= 42 print "sick"
            //   if temperature > 35 and temperature <= 37.5 print "healthy"
            //   use while (true) + break

        }
    }


    
        
    

