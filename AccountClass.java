/*
Name: Angel Carmichael
Class: Period 2
Created: 10/14/25
Last Modified: 10/15/2025
Purpose:  Make a class that holds user objects with value of ID and Initial balance. It also has method like deposit with draw 
    were you can input money and withdraw where you can take out money. The getbalance() check the balance check the users current balance. 
    getMonthlyInterestRate() gets the users monthly interest. getDateCreated() get the date that the account the account was created
*/

import java.time.LocalDate;

// Account Class implementation
public class AccountClass {
    public static void main(String[] args) {
        // user information and output
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterestRate());
        System.out.println("This account was created at " + account.getDateCreated());

        
    }
}

// Account Class functionality
class Account {
    // Private variables
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private LocalDate dateCreated =LocalDate.now();

    Account(){}
    // creates the account object
    Account(int ID, double initial){
        this.id = ID;
        this.balance = initial;
    }
    // Sets the monthly interest rate by dividing the annual Rate by 12 months
    double setAnnualInterestRate(double annnualIntrest){
        this.annualInterestRate = annnualIntrest;
        return annnualIntrest;
    }

    // calculates the monthly interest rate
    double getMonthlyInterestRate(){
        double monthlyInterest = this.annualInterestRate/12;
        return monthlyInterest;
    }
    // return the current Balance of the account
    double getBalance(){
        return this.balance;
    }
    // return the Date the account was made
    LocalDate getDateCreated(){
        return this.dateCreated;
    }

    // method for adding money to an account
    double withdraw(double output){
        double newBalance = balance-output;
        this.balance = newBalance;
        return newBalance;
    }
    // method for removing money to an account
    double deposit(double input){
        double newBalance = balance+input;
        this.balance = newBalance;
        return newBalance;
    }
}