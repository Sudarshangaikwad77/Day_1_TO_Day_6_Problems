package Operators;
import java.util.Scanner;
public class Quadratic {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input values for a, b, and c
            System.out.print("Enter value of a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter value of b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter value of c: ");
            double c = scanner.nextDouble();

            // Calculate delta
            double delta = b * b - 4 * a * c;

            // Check if delta is positive, negative, or zero
            if (delta > 0) {
                // Two distinct real roots
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Root 1 of x: " + root1);
                System.out.println("Root 2 of x: " + root2);
            } else if (delta == 0) {
                // One real root (repeated)
                double root = -b / (2 * a);
                System.out.println("Root of x: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Root 1 of x: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2 of x: " + realPart + " - " + imaginaryPart + "i");
            }

            scanner.close();
        }
    }

