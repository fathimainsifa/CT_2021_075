package Q_7;
import java.util.Scanner;
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        int weight = sc.nextInt();
        System.out.print("Enter height in centimeters: ");
        int height = sc.nextInt();
        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        sc.close();
    }
}
