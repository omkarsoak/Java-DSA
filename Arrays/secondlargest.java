import java.util.Arrays;

public class secondlargest
{
    public static int[] getSecondOrderElements(int n, int []arr) 
    {
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest) largest = arr[i];
        }

        int secondlargest = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > secondlargest && arr[i] < largest)
            {
                secondlargest = arr[i];
            }
        }


        int smallest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest) smallest = arr[i];
        }
        System.out.println(smallest);

        int secondsmallest = (int)10e9;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < secondsmallest && arr[i] > smallest)
            {
                secondsmallest = arr[i];
            }
        }

        int[] ans = {secondlargest,secondsmallest};
        return ans;

    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,6,7,3,5,4};
        System.out.println(Arrays.toString(getSecondOrderElements(arr.length, arr)));
    }
}