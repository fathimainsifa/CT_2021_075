package Q_5;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word or phrase: ");
                String input = scanner.nextLine();
                if (isPalindrome(input)) {
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("It is not a palindrome.");
                }

                scanner.close();
            }
        }


