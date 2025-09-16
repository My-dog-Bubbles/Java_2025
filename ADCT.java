
import java.util.Scanner;

public class ADCT {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvest = 0.0;
        futureInvest = investmentAmount*(1+monthlyInterestRate)*years*12;
        return futureInvest;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double investmentRate = keyboard.nextDouble();
        double loan = keyboard.nextDouble();
        int year = keyboard.nextInt();

        double futurevalue = futureInvestmentValue(loan, investmentRate, year);
        System.out.println("The amount investment: $"+ loan);
        System.out.println("_________________________________");
        System.out.println("Amount interest Rate: $" + investmentRate);
        System.out.println("________________________________________");
        for (Object elem : col) {
            System.out.println("Years: "+ i);
        }
        

    }
}
