import java.util.ArrayList;
import java.util.List;

public class combinations 
{
    /*static void combination(List<List<Integer>> combinations, List<Integer> choosen, int [] arr, int target, int start)
    {
        if(target == 0) 
        {
            combinations.add(new ArrayList<>(choosen));
            return;
        }
        else if(target > 0)
        { 
            for(int i = start; i < arr.length; i++)
            {
                choosen.add(arr[i]);
                combination(combinations, choosen, arr, target - arr[i], i); 
                //not i+1 because we can reuse same elements
                choosen.remove(choosen.size()-1);
            }
        }
    }*/

    
    static void combination(List<List<Integer>> combinations, List<Integer> choosen, int[] arr, int k, int start)
    {
        if(k == 0) 
        {
            combinations.add(new ArrayList<>(choosen));
            return;
        }

        for(int i = start; i < arr.length; i++)
        {
            if(i > start && arr[i] == arr[i-1]) continue; // skip duplicates
            choosen.add(arr[i]);
            combination(combinations, choosen, arr, k - 1, i+1); //not i+1 because we can reuse same elements
            choosen.remove(choosen.size()-1);
        }
    } 

    public static void main(String[] args) 
    {
        int[] nums = {1,2};
        int target = 2;
        List<List<Integer>> combinations = new ArrayList<>();

        combination(combinations, new ArrayList<>(), nums, target, 0);

        for(int i=0;i<combinations.size();i++)
        {
            System.out.println(combinations.get(i).toString());
        }

    }
}
