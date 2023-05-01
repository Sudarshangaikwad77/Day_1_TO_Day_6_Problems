package Arrays;
import java.util.Scanner;

public class LargestNum
{ 
    public static void main(String[] args)
    {
        int max = 0;
        int a[]={44,3,6,55,43,22};
        for(int i = 0; i < a.length; i++)
            max = a[0];
        
                for(int i = 0; i < a.length; i++)
                {
                    if(max < a[i])
                    {
                        max = a[i];
                    }
                }
                System.out.println("Maximum value in the array is:"+max);
            }
        }

