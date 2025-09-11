/*
Name: Angel Carmichael
Class: Period 2
Created: 9/10/25
Last Modified: 9/9/2025
Purpose:  Write a program that reads integers, finds the largest of them, and counts its occurrences.
Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the
program finds that the largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain
two variables, max and count. max stores the current max number, and count stores its
occurrences. Initially, assign the first number to max and 1 to count. Compare each
subsequent number with max. If the number is greater than max, assign it to max and
reset count to 1. If the number is equal to max, increment count by 1.)
*/
import java.util.*;


public class Exercise05_41 {
    public static void main(String[] args) {
        /* veriable decalred */
        int num = 0;
        int bigNum = 0;
        int count = 0;
        int i = 0;

        /* scanner creation */
        Scanner keyboard = new Scanner(System.in);

        /* getting the users numbers */
        System.out.print("Enter numbers: ");
        String numbers = keyboard.next();

        /* for loop to iterate through the number string */
        while (i<numbers.length()) {
            num = numbers.charAt(i);

            /* check if it was greater than the previous num the string */
            if(num>bigNum) {
                bigNum = num;
            }

            /* add one to the iteration */
            i++;
        }

        /* iterate through the number string to see the how many times the biggest number appears */
        for (i=0; i<numbers.length();i++) {
            /* check if num is equal to the biggest number */
            if(numbers.charAt(i)==bigNum) {
                /* add one to the count list */
                count++;
            }
        }

        /* output for the largest number and the amount it accrues */
        System.out.println("The largest number is " + (char)bigNum);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
