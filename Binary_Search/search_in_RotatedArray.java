
public class search_in_RotatedArray 
{
    public static int findpivot(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        //int mid;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(mid<high && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            else if(mid>low && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            else if(arr[mid] > arr[high])
            {
                low = mid + 1;
            }
            else if(arr[mid] < arr[low])
            {
                high = mid - 1;
            }
            else
            {
                return high;
            }
        }
        return arr[arr.length-1];
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

    public static int search(int[] nums, int target) 
    {
        if(nums.length<=2)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                    return i;
                }
            }
            return -1;
        }
        int pivot = findpivot(nums);

        if(nums[pivot]==target)
        {
            return pivot;
        }
        int ans = BinarySearch(nums,target,0,pivot);
        if(ans==-1)
        {
            ans = BinarySearch(nums,target,pivot+1,nums.length-1);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));

        int[] arr1 = {1,3,5};
        System.out.println(search(arr1, 0));
    }
}
