/*
Name: Angel Carmichael
Class: Period 2
Created: 9/5/25
Last Modified:
Purpose: Write a java program that wil calculate ticket for 3 customers based on their ages. 
*/


import java.util.Scanner;

public class Carmichael_1 {
    public static void main(String[] args) {
        String name = " ";
        int age = 0;

        Scanner keyboard = new Scanner(System.in);

        

        System.out.println("Welcome to the theater of Mindscape Cinema!!!!");
        System.out.println("What is the first customers Last name?");
        name = keyboard.next();
        System.out.print("What is the age of this customer?:");
        age = keyboard.nextInt();

        System.out.println((name.toLowerCase() == "angel") ? "OMGGGGG!!!!, MY NAME IS ANGEL." : "Cool name");
        
        if (age<0){
            System.out.println("You can't be a negative age?...");
            System.out.print("What is the age of this customer?:");
            age = keyboard.nextInt();
            if (age<0){
            System.out.println("I said you can't be a negative age?...");
            }
        }

        System.out.println();

        System.out.print("What is the name of the second customer?: ");
        name = keyboard.next();
        System.out.print("What is the age of this customer?: ");
        age = keyboard.nextInt();

        System.out.println((name.toLowerCase() == "angel") ? "OMGGGGG!!!!, MY NAME IS ANGEL." : "Cool name");


        System.out.print("What is the name of the third customer?: ");
        name = keyboard.next();
        System.out.print("What is the age of this customer?: ");
        age = keyboard.nextInt();

        System.out.println((name.toLowerCase() == "angel") ? "OMGGGGG!!!!, MY NAME IS ANGEL." : "Cool name");

        
    }
}
