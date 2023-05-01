package ifElseStatement;
import java.util.Scanner;
public class UnitReader
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number (1, 10, 100, or 1000): ");
            int number = sc.nextInt();
            sc.close();

            unit(number);
        }

        public static void unit(int number)
        {
            if (number < 1 || number > 1000)
            {
                System.out.println("Invalid number. Please enter 1, 10, 100, or 1000.");
            } else
            {
                int units = number % 10;
                int tens = (number / 10) % 10;
                int hundreds = (number / 100) % 10;
                int thousands = number / 1000;

                System.out.println("Number: " + number);
                System.out.println("Units: " + units);
                System.out.println("Tens: " + tens);
                System.out.println("Hundreds: " + hundreds);
                System.out.println("Thousands: " + thousands);
            }
        }
    }

