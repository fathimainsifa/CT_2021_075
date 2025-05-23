package Q_2;
import java.util.Scanner;
public class Digit {
    public static int countDigits(int number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int input;

                while (true) {
                    System.out.print("Enter a positive integer (negative number to quit): ");
                    input = scanner.nextInt();

                    if (input < 0) {
                        System.out.println("Negative number entered. Exiting...");
                        break;
                    }

                    int digits = countDigits(input);
                    System.out.println("Number of digits: " + digits);
                }

                scanner.close();
            }
        }

