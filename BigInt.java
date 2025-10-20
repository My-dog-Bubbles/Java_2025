import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your first number: ");
        Integer num1 = keyboard.nextInt();

        System.out.print("What is your second number: ");
        Integer num2 = keyboard.nextInt();

        System.out.println();

        BigInteger combine = getNumberOfCombinations(num1, num2);

        System.out.println("The combination of " + num1 + " and " + num2 + " is " + combine);
    }
    public static BigInteger getNumberOfCombinations(int n, int k) {
        // Not really sure how this works but I think it works.
        BigInteger totalConbin = new BigInteger("1");
        for(int i = 0; i<k; i++){
            totalConbin = totalConbin.multiply(BigInteger.valueOf(n-i+2)).divide(BigInteger.valueOf((i)));
        }
        return totalConbin;
    }
    
}
