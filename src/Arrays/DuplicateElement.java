package Arrays;

public class DuplicateElement
{
    public static void main(String[] args)
    {
       int arr[]={43,34,33,33,24,42,443};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1 ; j < arr.length; j++)

        {
            if (arr[i]==(arr[j]))
            {
                System.out.println(arr[i]);
            }
}
        }
    }
}
