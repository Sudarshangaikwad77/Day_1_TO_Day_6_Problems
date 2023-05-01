package Day5;

public class PowerOfTwo
{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOfTwoTable <N>");
            return;
        }

        // Parse the command-line argument N
        int N = Integer.parseInt(args[0]);

        // Check if N is within the valid range
        if (N < 0 || N >= 31) {
            System.out.println("N should be between 0 and 30 (inclusive).");
            return;
        }

        System.out.println("Power of Two Table for N = " + N + ":");
        System.out.println("-----------------------");

        // Calculate and print the powers of 2 that are less than or equal to 2^N
        for (int i = 0; i <= N; i++) {
            int powerOfTwo = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + powerOfTwo);
        }
    }
}

