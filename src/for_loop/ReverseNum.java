package for_loop;
import java.util.Scanner;
public class ReverseNum
{
    public static void main(String[] args) {
            // Create a Scanner object to read input from user
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer number: ");
            int n = scanner.nextInt();

            // Reverse the integer number
            int reversed = reverseInteger(n);

            System.out.println("Reversed number: " + reversed);
        }

        // Function to reverse an integer number
        public static int reverseInteger(int n) {
            int reversed = 0;

            // Loop through each digit of the input number
            while (n != 0) {
                int digit = n % 10; // Get the last digit
                reversed = reversed * 10 + digit; // Add the digit to the reversed number
                n /= 10; // Remove the last digit from the input number
            }

            return reversed;
        }
    }


