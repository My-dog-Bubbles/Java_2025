/*
 Name: Angel Carmichael
 Class:

 */

import java.util.*;
public class CH3_Promgram {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
double root1 = 0.0;
double root2 = 0.0;
        /* obtain the value of a,b,c: */
        System.out.println("What is the value of A:");
        double a = val.nextDouble();

        System.out.println("What is the value of B:");
        double b = val.nextDouble();

        System.out.println("What is the value of C:");
        double c = val.nextDouble();

        /* finding the value of discriminate */
        if (Math.pow(b,2)-(4*a*c)>0){
            root1 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            root2 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println(root1 + " and "+ root2 + " are your roots");
        } else if (Math.pow(b,2)-(4*a*c)<0){
            System.out.println("The equation has no real roots.");
        } else{
            double root = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println(root + " is your root");
        }
        }
}
