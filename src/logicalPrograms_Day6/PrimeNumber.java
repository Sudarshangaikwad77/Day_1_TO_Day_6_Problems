package logicalPrograms_Day6;
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If number is divisible by any number from 2 to sqrt(number), it's not prime
            }
        }

        return true; // If no divisors found, number is prime
    }
}

