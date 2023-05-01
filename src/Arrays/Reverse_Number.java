package Arrays;

public class Reverse_Number
{
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr); // Print the original array

        System.out.println("\nArray in Reverse Order:");
        reverseArray(arr); // Reverse the array and print it
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to reverse the elements of an array and print it
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap the elements at the start and end indices until they meet in the middle
        while (start < end) {
            // Swap the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Update the start and end indices
            start++;
            end--;
        }

        // Print the reversed array
        printArray(arr);
    }
}

