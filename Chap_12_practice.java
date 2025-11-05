/*
Name: Angel Carmichael
Class: Period 2
Created: 9/5/25
Last Modified: 9/9/2025
Purpose: Creates an array of 100 randomly chose integers and Prompts the user to enter the index of the array,
 then displays the corresponding element value. If the specified index is out of bounds,
 display the message "Out of Bounds". 
 */

import java.util.Scanner;

public class Chap_12_practice {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        // makes an array of an length of 100
        int[] elements = new int[100];

        // assigns the indexes in order a random value
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (Math.random() * 100);
        }

        // ask the user to give us an index
        System.out.print("Give me an index: ");
        int userIndex = Keyboard.nextInt();

        // Spacing
        System.out.println();

        // tries to print the element and the index that the user given
        try {
            System.out.println(elements[userIndex]);
        } catch (Exception outOfBound) { // if the given user index is out of bound it threws this error
            System.out.println("Out of Bounds");
        }
    }
}
