package Q_7;
import java.util.Scanner;
public class WordReplace {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a sentence: ");
                String sentence = scanner.nextLine();

                System.out.print("Enter the word to replace: ");
                String targetWord = scanner.nextLine();

                System.out.print("Enter the replacement word: ");
                String replacementWord = scanner.nextLine();

                String updatedSentence = sentence.replaceAll("\\b" + targetWord + "\\b", replacementWord);

                System.out.println("Updated sentence: " + updatedSentence);

                scanner.close();
            }
        }

