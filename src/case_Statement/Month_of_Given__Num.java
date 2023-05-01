package case_Statement;
import java.util.Scanner;
public class Month_of_Given__Num
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a month number (1-12): ");
            int monthNumber = scanner.nextInt();

            String monthName = getMonthName(monthNumber);

            if (monthName != null) {
                System.out.println("Month Name: " + monthName);
            } else {
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            }

            scanner.close();
        }

        public static String getMonthName(int monthNumber) {
            String monthName;

            switch (monthNumber) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = null;
            }

            return monthName;
        }
    }


