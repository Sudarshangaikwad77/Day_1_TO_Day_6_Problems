package ifElseStatement;
import java.util.Scanner;
public class NumberTOWord
{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a single-digit number (0-9): ");
            int number = sc.nextInt();
            sc.close();

            String word = convertToWord(number);
            System.out.println("The number " + number + " in words is: " + word);
        }

        public static String convertToWord(int number)
        {
            String word;
            if (number == 0) {
                word = "zero";
            } else if (number == 1) {
                word = "one";
            } else if (number == 2) {
                word = "two";
            } else if (number == 3) {
                word = "three";
            } else if (number == 4) {
                word = "four";
            } else if (number == 5) {
                word = "five";
            } else if (number == 6) {
                word = "six";
            } else if (number == 7) {
                word = "seven";
            } else if (number == 8) {
                word = "eight";
            } else if (number == 9) {
                word = "nine";
            } else {
                word = "Invalid number. Please enter a single-digit number (0-9).";
            }
            return word;
        }
    }

