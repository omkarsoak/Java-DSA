import java.util.HashMap;

public class hashmap 
{
    public static void main(String[] args) {
        HashMap<Integer,Integer> dp = new HashMap<>();
        int[] nums = {1,2,3,4,6,3,5,2};
        for(int i=0;i<nums.length;i++)
        {
            if(dp.containsKey(nums[i]))
            {
                int temp = dp.get(nums[i]);
                dp.put(nums[i],temp+1);
            }
            else
            {
                dp.put(nums[i], 1);
            }
        }

       

        int answer = 0;
        for(int i : dp.keySet())
        {
            //System.out.println(i + "-" + dp.get(i));
            if(dp.get(i)==2)
            {
                //System.out.println(i);
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
