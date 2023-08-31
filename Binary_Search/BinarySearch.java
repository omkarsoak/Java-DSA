public class BinarySearch
{
    //ascending order sorted
    public static int ascendingBinarySearch(int[] arr,int key)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while(low<=high)
        {
            mid = low + (high - low)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            else if(key < arr[mid])
            {
                high = mid - 1;
            }
            else if(key > arr[mid])
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    //descending order binary search
    public static int descendingBinarySearch(int[] arr,int key)
    {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low<=high)
        {
            mid = low + (high - low)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            else if(key > arr[mid])
            {
                high = mid - 1;
            }
            else if(key < arr[mid])
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(int arr[],int key)
    {
        int ans = -1;
        if(arr[0] > arr[arr.length-1])
        {
            ans = ascendingBinarySearch(arr, key);
        }
        else
        {
            ans = descendingBinarySearch(arr, key);
        }
        return ans;
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,8,12,13,167,345};
        System.out.println(orderAgnosticBinarySearch(arr, 5));
    }
}