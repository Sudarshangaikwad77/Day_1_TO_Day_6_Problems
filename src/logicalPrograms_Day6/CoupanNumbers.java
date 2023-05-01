package logicalPrograms_Day6;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CoupanNumbers
{
    // Function to generate a random coupon number
    public static int generateCouponNumber() {
        Random random = new Random();
        return random.nextInt(1000); // Change 1000 to the desired range of coupon numbers
    }

    // Function to generate distinct coupon numbers
    public static int generateDistinctCoupons(int n) {
        Set<Integer> couponSet = new HashSet<>();
        int count = 0;
        while (couponSet.size() < n) {
            int couponNumber = generateCouponNumber();
            count++;
            couponSet.add(couponNumber);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10; // Number of distinct coupon numbers to generate
        int totalRandomNumbersNeeded = generateDistinctCoupons(n);
        System.out.println("Total random numbers needed to have " + n + " distinct coupon numbers: " + totalRandomNumbersNeeded);
    }
}

