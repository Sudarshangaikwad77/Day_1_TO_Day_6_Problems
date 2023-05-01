package Operators;
import java.util.Scanner;
public class Max_Min
{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Input first number
            System.out.print("Enter the first number: ");
            double a = input.nextDouble();

            // Input second number
            System.out.print("Enter the second number: ");
            double b = input.nextDouble();

            // Input third number
            System.out.print("Enter the third number: ");
            double c = input.nextDouble();

            // Perform arithmetic operations
            double result1 = a + b * c;
            double result2 = c + a / b;
            double result3 = a % b + c;
            double result4 = a * b + c;

            // Find max and min
            double max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
            double min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

            // Display results
            System.out.println("Result 1: a + b * c = " + result1);
            System.out.println("Result 2: c + a / b = " + result2);
            System.out.println("Result 3: a % b + c = " + result3);
            System.out.println("Result 4: a * b + c = " + result4);
            System.out.println("Maximum result: " + max);
            System.out.println("Minimum result: " + min);

            input.close();
        }
    }


