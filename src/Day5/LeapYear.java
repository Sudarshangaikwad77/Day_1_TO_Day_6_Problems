package Day5;
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter the year");

        int year= sc.nextInt();
        boolean leap = false;

        if (year>=1000 && year<=9999)
        {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
        else
            System.out.println("enter the four digit numer year.");
}
}






