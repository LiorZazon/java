package com.company;

//import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		//* Targil:
		//1. Create a String variable called "id" with your id
		//2. Create a String variable called "full_name" with your full name
		//3. Create a String variable called "address" with your address
		//4. create a String variable called "details" with id + full_name + address + details
		//5. print details to string
		//6. add spaces between id and full_name and address and details ...
		//7. *etgar:
		//create String fname variable and read from the keyboard the first name of the user
		//create String lname variable and read from the keyboard the last name of the user
		//then print the user first_name and last name in one line...

		// Good luck! :)
		Scanner s = new Scanner(System.in);

		// answers:
		String id = "204262";
		String full_name = "lior zazon";
		String address =  "beer sheva";
		String details = id + full_name + address;
		System.out.println(details);
		System.out.println(id + " " + full_name + " " + address + " " + details);
		//Scanner lior = new Scanner(System.in);
		//String fname = fname.nextLine(lior);
		//etgar: i was having a hard time trying to solve it, i assumed it had something to do with the scanner
		// but still couldn't solve it.
		String fname = "lior";
		String lname = "zazon";

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(fname + " " + lname);




	}
}
