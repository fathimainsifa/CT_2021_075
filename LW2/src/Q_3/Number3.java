package Q_3;
import java.util.Scanner;
public class Number3 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (1.8 * celsius) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                sc.close();
            }
        }

