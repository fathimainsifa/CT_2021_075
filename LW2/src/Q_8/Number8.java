package Q_8;
import java.util.Scanner;
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3) * 3.14 * Math.pow(radius, 3);
        System.out.println("Volume of the sphere is: " + String.format("%.2f", volume));
        sc.close();
    }
}
