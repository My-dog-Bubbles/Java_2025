/*

* Name: Exercise05_41

* Purpose: Write a program that reads integers, finds the largest of them, and counts 
its occurrences.

* Programmer: Sham Nemer

* Date: 9 / 8 / 2025

*/

// Importing the Scanner class to read user input

import java.util.Scanner;

// Creating the main class

public class tester {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Asking for user input and initializing variables to store the largest number and its count and the user input
    System.out.print("Enter integers: ");
    int numbers = input.nextInt();
    int max = numbers;
    int count = 1; 
    // Using a while to iterate through user input until 0 is entered and check which number is the largest and how many times it occurs
    while (numbers != 0) {
        numbers = input.nextInt();

        if (numbers > max) {
            max = numbers;
            count = 1;
        } else if (numbers == max) {
            count++;
        }
    }
    // Checking that the user entered at least one number other than 0 and printing the results
    
        System.out.println("The largest number is 0 because it is the only number entered!");
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
        input.close();
    }
}

