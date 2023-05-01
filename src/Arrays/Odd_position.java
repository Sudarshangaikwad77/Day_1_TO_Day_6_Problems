package Arrays;

public class Odd_position
{
    public static void main(String[] args)
    {
        int arr[]={56,65,44,565,64,464,46,46};
        System.out.println("elemennt at odd possition are : ");
        for (int i = 0; i< arr.length; i++)
        {
            if (i%2 == 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
