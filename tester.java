/*

* Name: Exercise03_01Extra

* Purpose: Test if a fraction is proper or improper

* Programmer: Sham Nemer

* Date: 8 / 27 / 2025

*/

import java.util.Scanner;

// Create the main class

public class tester {

// Using Scanner to get the user input for the numerator and denominator

public static void main(String[] args) {

Scanner userValues = new Scanner(System.in);
System.out.println("Please enter values for the numerator and the denominator: ");

// Assigning the user input for the numerator and the denominator to variables

int numerator = userValues.nextInt();

int denominator = userValues.nextInt();



// Running a formula to get the remainder of the numerator divided by the denominator 

int remainder = numerator % denominator;

// Checking if it is improper or proper and outputting if it is and its mixed fraction or reducing if applicable

if(numerator > denominator && remainder == 0) {

int quotient = numerator / denominator;

System.out.println(numerator + " / "+ denominator+ " is a improper fraction and can be reduced to " + quotient);

}

else if(numerator > denominator && remainder != 0) {

int wholeNum = numerator / denominator;

System.out.println(numerator + " / "+ denominator+ " is an improper fraction and its mixed fraction is " + wholeNum + " + " +
remainder + " / " + denominator);

}

else {

System.out.println(numerator + " / "+ denominator+ " is a proper fraction!");

}

}

}