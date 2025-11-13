/*
Name: Angel Carmichael
Class: Period 2
Created: 11/6/25
Last Modified: 11/13/2025
Purpose:  Write a program that that reads a file and returns the total of the scores and the average of the scores
 */

// imports
import java.net.URL;
import java.util.*;

public class scores {

    public static void main(String[] args) {
        // initalized veriables
        double total = 0.0;
        double avg = 0.0;
        int number = 0;
        int numbers = 0;
        int lines = 0;
        URL url;

        // try to make a URL and make a scanner so I can read it
        try {
            url = new URL("https://liveexample.pearsoncmg.com/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());

            // reads through the txt while the is data
            while (input.hasNext()) {
                // reads through the txt while the is data
                while (input.hasNextLine()) {
                    // incrementer
                    number = input.nextInt();
                    numbers += 1;

                    // adds the number to the total
                    total += number;
                }

                // incrementer
                input.nextLine();
                lines += 1;
            }

            // runs if the url or if any of the other code has errors
        } catch (Exception incorrectURL) {
            System.out.println("The URL is formatted incorrectly.");
        }

        // finds the average 
        avg = total / numbers;

        //output
        System.out.println("Total is " + total);
        System.out.println("Average is " + avg);
    }
}
