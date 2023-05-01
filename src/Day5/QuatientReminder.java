package Day5;
import java.util.Scanner;
public class QuatientReminder
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();


        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}

