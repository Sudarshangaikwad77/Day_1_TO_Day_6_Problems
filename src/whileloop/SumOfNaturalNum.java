package whileloop;
import java.util.Scanner;
public class SumOfNaturalNum
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = input.nextInt();

        int sum = 0;
        int counter = 1;

        while (counter <= N) {
            sum += counter;
            counter++;
        }

        System.out.println("Sum of " + N + " natural numbers is: " + sum);
    }
}

