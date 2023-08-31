import java.util.ArrayList;

public class subarrays 
{
    static ArrayList<ArrayList<Integer>> SubArrays(int[] arr)
    {
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int k=i;k<=j;k++)
                {
                    temp.add(arr[k]);
                }
                subarrays.add(temp);
            }
        }
        return subarrays;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        subarrays = SubArrays(arr);
        for(ArrayList<Integer> i : subarrays)
        {
            System.out.println(i.toString());
        }
    }
}
