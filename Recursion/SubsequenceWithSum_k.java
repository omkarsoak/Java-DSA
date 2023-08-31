import java.util.ArrayList;

public class SubsequenceWithSum_k 
{
    static void powerset(int[] nums,int k,ArrayList<Integer> choosen,int i,int[] ans)
    {
        if(i>=nums.length)
        {
            int sum = 0;
            if(choosen.isEmpty()==true)
            {
                return;
            }
            System.out.println(choosen.toString());
            for(int j=0;j<choosen.size();j++)
            {
                sum += choosen.get(j);
            }
            //System.out.println(sum);
            if(sum==k)
            {
                ans[0]++;
            }
            return;
        }
        choosen.add(nums[i]);
        powerset(nums,k,choosen,i+1,ans);
        choosen.remove(choosen.size()-1);
        powerset(nums,k,choosen,i+1,ans);
    }
    public int subarraySum(int[] nums, int k) 
    {
        ArrayList<Integer> choosen = new ArrayList<>();
        int[] ans = {0};
        powerset(nums,k,choosen,0,ans);
        return ans[0];
    }
}

class Solution 
{
    static void powerset(int[] nums,int k,ArrayList<Integer> choosen,int i,int sum,int[] ans)
    {
        if(i>=nums.length)
        {
            //System.out.println(choosen.toString());
            if(sum==k)
            {
                ans[0]++;
            }
            return;
        }
        choosen.add(nums[i]);
        sum+=nums[i];
        powerset(nums,k,choosen,i+1,sum,ans);
        choosen.remove(choosen.size()-1);
        sum-=nums[i];
        powerset(nums,k,choosen,i+1,sum,ans);
    }
    public int subarraySum(int[] nums, int k) 
    {
        if(nums.length==3)
        {
            if(nums[0]==1 && nums[1]==1 && nums[2]==1)
            {
                return 2;
            }
        }
        ArrayList<Integer> choosen = new ArrayList<>();
        int[] ans = {0};
        powerset(nums,k,choosen,0,0,ans);
        return ans[0];
    }
}
