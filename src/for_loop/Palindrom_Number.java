package for_loop;
import java.util.Scanner;
public class Palindrom_Number
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }
        }

        public static boolean isPalindrome(int number) {
            int originalNumber = number;
            int reversedNumber = 0;
            int remainder;

            while (number > 0) {
                remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number /= 10;
            }

            return originalNumber == reversedNumber;
        }
    }


