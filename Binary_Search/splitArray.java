
public class splitArray 
{
    public static int splitarray(int[] arr, int k) 
    {
        //finding the range of answer
        int low = 0;
        int high = 0;
        for(int i=0;i<arr.length;i++)
        {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }

        //binary search
        while(low < high)
        {
            int maxsum = 0;
            int pieces = 1;
            int mid = low + (high-low)/2;
            for(int num:arr)
            {
                if(maxsum + num > mid)    //split into subarray
                {
                    maxsum = num;
                    pieces = pieces + 1;
                }
                else   //continue the same subarray
                {
                    maxsum += num;
                }
            }

            if(pieces > k)    
            {
                low = mid + 1;
            }
            else    //pieces <= k , so we can further reduce maxsum using higher pieces
            {
                high = mid;
            }
        }
        return high;    //here low=mid=high that is the answer
    }

    public static void main(String[] args) 
    {
        int[] arr = {7,2,5,10,8};
        System.out.println(splitarray(arr, 2));
    }
}
