import java.util.Arrays;

public class reversearray 
{
    static void reverse(int[] arr,int i,int j)
    {
        if(i>=j)
        {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);
    }

    static boolean palindrome(int[] arr,int i,int j)
    {
        if(i>=j)
        {
            return true;
        }
        if(arr[i]!=arr[j])
        {
            return false;
        }
        return palindrome(arr, i+1, j-1);
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int[] pal = {1,2,3,3,2,1};
        System.out.println(palindrome(pal, 0, pal.length-1));
    }
}
