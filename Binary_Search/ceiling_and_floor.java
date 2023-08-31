public class ceiling_and_floor 
{
    public static int findCeiling(int[] arr,int key)
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
        return low;
    }

    public static int findFloor(int[] arr,int key)
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
        return high;
    }

    public static char nextGreatestLetter(char[] letters, char target) 
    {
        int low = 0;
        int high = letters.length - 1;
        int mid = 0;

        //dont take target==mid case as it is not allowed
        while(low<=high)
        {
            mid = low + (high-low)/2;

            if(target < letters[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return letters[low%letters.length];
        //if low = last element, it will return letters[0] (wrap around condition)
    }
    
    public static void main(String[] args) 
    {
        //int[] arr = {2,3,5,9,14,16,18};
        //System.out.println(findCeiling(arr, 15));
        //System.out.println(findFloor(arr, 15));
        char[] arr1 = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr1, 'a'));
    }
}
