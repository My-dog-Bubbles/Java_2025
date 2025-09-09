/*
Name: Angel Carmichael
Class: Period 2
Created: 9/5/25
Last Modified: 9/9/2025
Purpose: Write a java program that wil calculate ticket for 3 customers based on their ages. 
*/


import java.util.Scanner;

public class Carmichael_1 {

    /* Function for finding the price based on age range*/
    public static double ageVerification(int a) {
        double price = 0.0;
        if (a<0){
        } else if (a>=0 && a<=5){
            price = 0.0;
        } else if (a>5 && a<=12) {
            price = 5;
        } else if (a>12 && a<=17) {
            price = 8;
        } else if (a>17 && a<=59) {
            price = 12;
        } else if (a>59) {
            price = 6;
        }
        return price;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /* Declaring my veriables */
        String name1 = " ";
        String name2 = " ";
        String name3 = " ";

        int age1 = 0;
        int age2= 0;
        int age3 = 0;

        double price1 = 0.0;
        double price2 = 0.0;
        double price3 = 0.0;

        /* Getting customer 1 input */
        System.out.println("Welcome to the theater of Mindscape Cinema!!!!");
        System.out.print("What is the first customers Last name?: ");
        name1 = keyboard.next();
        System.out.print("What is the age of this customer?: ");
        age1 = keyboard.nextInt();

        /* calls the users ageVerfuction function  to get the price */
        price1 = ageVerification(age1);
        
        System.out.println();

        /* Getting customer 2 input */
        System.out.print("What is the last name of the second customer?: ");
        name2 = keyboard.next();
        System.out.print("What is the age of this customer?: ");
        age2 = keyboard.nextInt();

        /* calls the users ageVerfuction function  to get the price */
        price2 = ageVerification(age2);

        System.out.println();

        /* Getting customer 3 input */
        System.out.print("What is the last name of the third customer?: ");
        name3 = keyboard.next();
        System.out.print("What is the age of this customer?: ");
        age3 = keyboard.nextInt();

        /* calls the users ageVerfuction function  to get the price */
        price3 = ageVerification(age3);

        System.out.println();
        /* output customer output */
        System.out.println("Customer 1 Name: " + name1 + "\nCustomer 1 Age: " + age1 + "\nCustomer 1 Ticket Price: $" + price1+"\n");
        System.out.println("Customer 2 Name: " + name2 + "\nCustomer 2 Age: " + age2 + "\nCustomer 2 Ticket Price: $" + price2+"\n");
        System.out.println("Customer 3 Name: " + name3 + "\nCustomer 3 Age: " + age3 + "\nCustomer 3 Ticket Price: $" + price3+"\n");

        System.out.println("______________________Calculations______________________\n");
        
        /* customer total calculations */
        System.out.print("Subtotal: $");
        System.out.println(price1+price2+price3);

        System.out.print("Total Charge: $");
        System.out.println((price1+price2+price3)*1.05);
    }
}