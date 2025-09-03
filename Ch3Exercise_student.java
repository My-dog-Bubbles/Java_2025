/*
 Name: Angel Carmichael
 Purpose: find out if the givin number is an improper fraction or not
 Date Created: 8/27/2025
 Program Name: Is it proper (whole or fraction)?
 */

/* import scanner to use to get user input */
import java.util.*;
public class Ch3Exercise_student {
    /* finding the greatest common factor for proper fractions */
    public static int gcd(int a, int b) {
        if (b==0){
            return a;
        }
        return gcd(b, a%b);   
    }

    public static void main(String[] args) {
        int reduced;
        int newNumerator;
        int gcd;

        /* scanner to use to get user input */
        Scanner val = new Scanner(System.in);

        /* input felid for numerator and denominator */
        System.out.print("Give me a numerator: ");
        int numerator = val.nextInt();
        System.out.print("Give me a denominator: ");
        int denominator = val.nextInt();
        reduced = numerator/denominator;

        /* Calculate if the numerator and denominator makes a proper or improper fraction */
        if (numerator%denominator==0){
            System.out.println( numerator + " / " + denominator + " is an improper fraction and can be reduced to " + reduced);
        } else if (numerator<denominator){
            /* use the greatest common factor to simplify the fraction */
            gcd = gcd(numerator,denominator);
            System.out.println( numerator/gcd + " / " + denominator/gcd + " is a proper fraction");
        } else{
            newNumerator = numerator-(reduced*denominator);
            gcd = gcd(numerator,denominator);
            System.out.println( numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + reduced + " + " + newNumerator/gcd + " / " + denominator/gcd);
        }
    }
}