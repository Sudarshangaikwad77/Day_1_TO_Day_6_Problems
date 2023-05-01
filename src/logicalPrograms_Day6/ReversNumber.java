package logicalPrograms_Day6;
import java.util.Scanner;
public class ReversNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reverse = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10; // Calculate the remainder
            reverse = reverse * 10 + remainder; // Reverse the number
            number /= 10; // Divide the number by 10
        }

        System.out.println("Reversed number: " + reverse);
        scanner.close();
    }
}
