package logicalPrograms_Day6;
import java.util.Scanner;
public class FibonacciSeries
{

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
