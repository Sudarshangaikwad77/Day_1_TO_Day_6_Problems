package Day5;
import java.util.Scanner;
public class Factors
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int n = scanner.nextInt();
        System.out.print("Prime factors of " + n + ": ");
        computePrimeFactors(n);
        scanner.close();
    }

    public static void computePrimeFactors(int n) {
        // Iterate from 2 to square root of n
        for (int i = 2; i * i <= n; i++) {
            // Check if i is a prime factor of n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}

