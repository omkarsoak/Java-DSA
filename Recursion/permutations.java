import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations 
{
    /*static void permutation(int[] arr, List<List<Integer>> permutes, List<Integer> choosen, boolean[] selected)
    {
        if(choosen.size() == arr.length)
        {
            permutes.add(new ArrayList<>(choosen));
            return;
        }
        for(int i = 0; i < arr.length; i++)
        { 
            if(selected[i]!=true)
            {
                selected[i] = true;
                choosen.add(arr[i]);
                permutation(arr, permutes, choosen, selected);
                choosen.remove(choosen.size() - 1);
                selected[i] = false;
            }
        }
    }*/

    static void permutation(int[] arr, List<List<Integer>> permutes, List<Integer> choosen, boolean[] selected)
    {
        if(choosen.size() == arr.length)
        {
            permutes.add(new ArrayList<>(choosen));
            return;
        }
        for(int i = 0; i < arr.length; i++)
        { 
            if(i > 0 && arr[i] == arr[i-1] && selected[i-1]==false) continue;
            if(selected[i]!=true)
            {
                selected[i] = true;
                choosen.add(arr[i]);
                permutation(arr, permutes, choosen, selected);
                choosen.remove(choosen.size() - 1);
                selected[i] = false;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {3,3,0,3};
        List<List<Integer>> permutes = new ArrayList<>();
        List<Integer> choosen = new ArrayList<>();
        boolean[] selected = new boolean[nums.length];

        Arrays.sort(nums);

        permutation(nums, permutes, choosen, selected);

        for(int i=0;i<permutes.size();i++)
        {
            System.out.println(permutes.get(i).toString());
        }
    }
    
}
