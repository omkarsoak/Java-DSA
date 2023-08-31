public class infiniteArray 
{
    public static int infiniteSearch(int[] arr,int key)
    {
        int low = 0;
        int high = 1;
        while(key >= arr[high])
        {
            int low_temp = high + 1;
            high = high + (high-low+1)*2;
            low = low_temp;
        }
        return BinarySearch(arr, key,low,high);
    }

    public static int BinarySearch(int[] arr,int key,int low,int high)
    {
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

    public static void main(String[] args) 
    {
        int[] arr = {2,3,4,7,9,15,18,21,28,32,38};
        int ans = infiniteSearch(arr, 3);
        System.out.println(ans);
    }
}
