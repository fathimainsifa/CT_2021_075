package Q_9;
import java.util.Scanner;
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        double principal = sc.nextDouble();
        System.out.print("Enter annual interest rate (R) in percent: ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years (N): ");
        int years = sc.nextInt();
        double amount = principal * Math.pow(1 + (rate / 100), years);
        System.out.println("Amount after " + years + " years: " + String.format("%.2f", amount));
        sc.close();
    }
}
