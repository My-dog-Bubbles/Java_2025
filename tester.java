/*

 * Christopher Markham

 * 9/15/2025

 * Future Investment Computer

 * Calculates future investments

 */

import java.util.Scanner;

 class Main { 

  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) { 

    double futureInvestment = investmentAmount * Math.pow(1 + monthlyInterestRate,(years * 12)); // The Math calculation

    return futureInvestment; 

  } 

  public static void main(String[] args) { 

    Scanner input = new Scanner(System.in); // Get input

     System.out.println("Investment amount: "); 

     String investAmount = input.nextLine(); 

     System.out.println("Annual Interest Rate: "); 

     String interestRate = input.nextLine(); 

     double dInvestAmount = Double.parseDouble(investAmount); // Converts string input to double

     double dInterestRate = Double.parseDouble(interestRate)/1200.0; // Accounts for percentage and year to month conversion

     System.out.println("Years : Future Value"); 

     for (int i = 1; i < 31; i++) { // Runs for the 1-30 years

      double results = futureInvestmentValue(dInvestAmount, dInterestRate, i); // Run method

      System.out.println(i+" : " + results); // Output results

    } 

  } 

}