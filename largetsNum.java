/*
Name: Angel Carmichael
Class: Period 2
Created: 10/1/25
Last Modified: 10/1/2025
Purpose:  Write a program that the location of the largest element in a two-decisional 
    array with given user data about the array.
*/
import java.util.*;

public class largetsNum {
    public static int[] locateLargest(double[][] array, int row, int column){     
        int i = 0;
        int j = 0;
        double newMax = 0.0;
        double max = 0.0;
        for (i = 0; i<=row;i++) {
            for (j = 0; j<=column; j++){
                // checks if the number at that index is greater than max and if it is than that is the new value of max.
                newMax = array[i][j];
                if (newMax>max){
                    max = newMax;
                }
            }
        } 
        int [] output = {i,j}; 
        return output;
    }
    public static void main(String[] args) {
        // getting the scanner so I can get user input
        Scanner keyboard = new Scanner(System.in);

        // variable initialization
        

        // getting user input for size of array
        System.out.print("Enter the number of rows in the array: ");
        int rows = keyboard.nextInt();
        System.out.println("");

        System.out.print("Enter the number of columns in the array: ");
        int columns = keyboard.nextInt();
        System.out.println("");

        double[][] numbers = new double[rows][columns];

        /*
        -- might add a loop for getting input
        -- steps of for loop:
            - outside loop:
                + continue while (rows) is less than or equal to row
                + go to inside loop

            - inside loop: 
                + takes outside loop val of (rows) and uses as row
                + continue while (columns) is less than of equal to column
                + system output asking for val text
                + ask user for val
                + adds val at index [i][j]

        */

        for (int i = 0; i<=rows; i++) {
            for (int j = 0; j<=columns; j++){
                System.out.println("Enter a value for the array: ");
                double arrayVal = keyboard.nextDouble();
                numbers[i][j] = arrayVal;
                System.out.println("is it running");
            }
            System.out.println("is it running out");
        } 

        // call the largest number function and returns the index
        System.out.println("The location of the largest in at " + locateLargest(numbers,rows,columns));
    }
}
 