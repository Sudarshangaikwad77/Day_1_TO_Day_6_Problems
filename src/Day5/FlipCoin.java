package Day5;
import java.util.Scanner;
import java.util.Random;

public class FlipCoin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = sc.nextInt();

        if (numFlips <= 0) {
            System.out.println("Number of flips should be a positive integer.");
            return;
        }

        double random = (Math.random());
        int numHeads = 0;
        int numTails = 0;

        for (int i = 0; i < numFlips; i++) {
            double flip = random; // Generate a random value between 0 and 1
            if (flip < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        double percentageHeads = (numHeads * 100.0) / numFlips;
        double percentageTails = (numTails * 100.0) / numFlips;

        System.out.println("Number of Heads: " + numHeads);
        System.out.println("Number of Tails: " + numTails);
        System.out.println("Percentage of Heads: " + percentageHeads + "%");
        System.out.println("Percentage of Tails: " + percentageTails + "%");
    }
}

