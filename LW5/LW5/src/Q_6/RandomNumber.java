package Q_6;
import java.util.Scanner;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int targetNumber = random.nextInt(100) + 1;
                int guess;

                System.out.println("Guess the number (between 1 and 100):");

                while (true) {
                    System.out.print("Enter your guess: ");
                    guess = scanner.nextInt();

                    if (guess < targetNumber) {
                        System.out.println("Higher!");
                    } else if (guess > targetNumber) {
                        System.out.println("Lower!");
                    } else {
                        System.out.println("Congratulations! You guessed the correct number.");
                        break;
                    }
                }

                scanner.close();
            }
        }


