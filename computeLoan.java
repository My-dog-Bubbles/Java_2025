import java.util.*;
/* 
 * @param datatype name -- one per parameter
 * @return datatype name
 * @author
 * @version
 * @throws Exception ... description
 */
public class computeLoan {
    public static double getMonthlyPayment (double annualInerestRate, int numberOfYears, double loanAmount){
        double monthlyRate = annualInerestRate/1200;
        double months = numberOfYears*12;
        return loanAmount*monthlyRate/(1-Math.pow(1+monthlyRate, -months));
    }
    public static double getTotalPayment (double annualInvestmentRate, int numberOfYears, double loanAmount){
        return getMonthlyPayment(annualInvestmentRate,numberOfYears,loanAmount)*numberOfYears*12;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter yearly interest rate: ");
        double interestRate = keyboard.nextDouble();

        System.out.print("Enter number of years as an int: ");
        int years = keyboard.nextInt();

        System.out.print("Enter loan amount: ");
        double loan = keyboard.nextDouble();

        double monthlyPayment = getMonthlyPayment(interestRate, years, loan);
        double totalLoan = getTotalPayment(interestRate, years, loan);
        System.out.println();
        System.out.printf("The monthly payment is $%.2f", monthlyPayment);
        System.out.println();
        System.out.printf("The total payment $%.2f", totalLoan);

    }
}
