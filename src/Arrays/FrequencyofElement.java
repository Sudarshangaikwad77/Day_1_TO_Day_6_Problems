package Arrays;

public class FrequencyofElement
{
    public static void main(String[] args)
        {
            int[] arr = { 1, 2, 3, 4, 3, 2, 1, 1, 3, 4, 5, 5, 5 };

            int[] frequencyArr = findFrequency(arr);

            for (int i = 0; i < frequencyArr.length; i++)
            {
                if (frequencyArr[i] > 0) {
                    System.out.println("Element " + (i + 1) + " occurs " + frequencyArr[i] + " times");
                }
            }
        }

        public static int[] findFrequency(int[] arr)
        {
            int[] frequencyArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++)
            {
                int count = 0;

                if (frequencyArr[i] != -1)
                {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j])
                        {
                            count++;
                            frequencyArr[j] = -1;
                        }
                    }
                    frequencyArr[i] = count + 1;
                }
            }
            return frequencyArr;
        }
    }


