package Q_10;
import java.util.Scanner;
public class Number10 {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter loan period (in years): ");
        int loanPeriod = sc.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: " + String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: " + String.format("%.2f", totalPayment));

        sc.close();
    }
}
