package whileloop;
import java.util.Scanner;
public class ReversInteger
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = scanner.nextInt();
        int reversedNumber = 0;
        int remainder;

        while (n != 0) {
            remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}

