/*
 Name: Angel Carmichael
 Class: Period 2
 Date: 8/26/25
 */

import java.util.*;
public class CH3_Promgram {
    public static void main(String[] args) {
        /* grab the keyboard scanner */
        Scanner val = new Scanner(System.in);

/* define root veariable */
double root1 = 0.0;
double root2 = 0.0;

        /* obtain the value of a,b,c: */
        System.out.println("What is the value of A:");
        double a = val.nextDouble();

        System.out.println("What is the value of B:");
        double b = val.nextDouble();

        System.out.println("What is the value of C:");
        double c = val.nextDouble();

        /* out put based on the value of discriminate */
        if (Math.pow(b,2)-(4*a*c)>0){
            root1 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            root2 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println(root1 + " and "+ root2 + " are your roots");
        } else if (Math.pow(b,2)-(4*a*c)<0){
            System.out.println("The equation has no real roots.");
        } else{
            root1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println(root1 + " is your root");
        }
    }
}
