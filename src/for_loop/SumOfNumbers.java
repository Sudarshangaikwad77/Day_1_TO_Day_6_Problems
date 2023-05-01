package for_loop;
import java.util.Scanner;
public class SumOfNumbers {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();
        input.close();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;

            }
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);

            }
        }
    }


