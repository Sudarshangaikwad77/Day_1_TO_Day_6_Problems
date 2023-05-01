package Operators;

public class Command_Line
{
    public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Usage: java SpringSeason <month> <day>");
                return;
            }

            int m = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);

            boolean isSpringSeason = false;

            if (m == 3 && d >= 20) {
                isSpringSeason = true;
            } else if (m > 3 && m < 6) {
                isSpringSeason = true;
            } else if (m == 6 && d <= 20) {
                isSpringSeason = true;
            }

            System.out.println(isSpringSeason);
        }
    }

