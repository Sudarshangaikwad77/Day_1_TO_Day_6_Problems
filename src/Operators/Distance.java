package Operators;

public class Distance
{
    public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Usage: java Distance <x> <y>");
                return;
            }

            // Parse command-line arguments
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // Calculate distance using Euclidean formula
            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            // Print the result
            System.out.println("The Euclidean distance from (" + x + ", " + y + ") to the origin (0, 0) is: " + distance);
        }
    }

