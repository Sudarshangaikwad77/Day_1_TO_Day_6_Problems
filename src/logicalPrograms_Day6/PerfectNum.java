package logicalPrograms_Day6;
import java.util.Scanner;

public class PerfectNum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // A positive number is required to be a perfect number
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
            {
                sum += i;
            }
        }

        return sum == number;
    }
}

