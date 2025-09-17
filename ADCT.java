/*
Name: Angel Carmichael
Class: Period 2
Created: 9/16/25
Last Modified: 9/17/2025
Purpose: Write a method that computes future investment value at a given interest rate for a specified number of years. 
*/

import java.util.Scanner;

public class ADCT {
    /* make an function to the formula of finding the future investment value */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvest = 0.0;
        futureInvest = investmentAmount*Math.pow((1+monthlyInterestRate),years*12);
        return futureInvest;
    }

    /* main function */
    public static void main(String[] args) {
        /* initialize at the top */
        double futurevalue = 0.0;

        /* creat scanner key and variables */
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter you invest rate: ");
        double investmentRate = keyboard.nextDouble();

        System.out.print("Enter you investment amount: ");
        double loan = keyboard.nextDouble();

        /* formating fo the loan investment output */
        System.out.println();
        System.out.println("The amount investment: $"+ loan);
        System.out.println("_________________________________");
        System.out.println("Amount interest Rate: " + investmentRate);
        System.out.println("________________________________________");
        System.out.println();

        /* loops through 30 years and find the investment value by that year */
        for (int i = 1; i<=30; i++) {
            System.out.println("Years: "+ i);
            futurevalue = futureInvestmentValue(loan, investmentRate/12, i);
            System.out.println("Future Value: " + futurevalue);
        }
    }
}
