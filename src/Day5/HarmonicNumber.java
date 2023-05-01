package Day5;
import java.util.Scanner;
public class HarmonicNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n == 0) {
            System.out.println("Error: N cannot be zero.");
            return;
        }

        double harmonicNumber = 0;
        for (int i = 1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + n + "th Harmonic Value is: " + harmonicNumber);
    }
}

