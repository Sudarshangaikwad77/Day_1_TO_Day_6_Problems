package Arrays;

public class SmallNum
{
    public static void main(String[] args)
    {

        int min = 0;
        int a[]={44,3,6,55,43,22};
        for(int i = 0; i < a.length; i++)
            min = a[0];

        for(int i = 0; i < a.length; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value in the array is:"+min);
    }
    }

