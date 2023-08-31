import java.util.ArrayList;
import java.util.List;

public class subsets 
{
    static void powerset(int[] arr,int i,ArrayList<ArrayList<Integer>> Subsets,ArrayList<Integer> choosen)
    {
        if(i>=arr.length)
        {
            Subsets.add(new ArrayList<>(choosen));
            return;
        }
        choosen.add(arr[i]);
        powerset(arr,i+1,Subsets,choosen);
        choosen.remove(choosen.size()-1);
        powerset(arr,i+1,Subsets,choosen);
    }

    static void Powerset(int [] arr,int start, List<List<Integer>> Subsets , List<Integer> choosen)
    {
        for(int i = start; i < arr.length; i++)
        {
            choosen.add(arr[i]);
            Powerset(arr,i+1,Subsets,choosen);
            choosen.remove(choosen.size() - 1);
        }
    }

    static void PowerSet(int [] arr,int start, List<List<Integer>> Subsets , List<Integer> choosen)
    {
        Subsets.add(new ArrayList<>(choosen));
        for(int i = start; i < arr.length; i++)
        {
            if(i > start && arr[i] == arr[i-1]) continue; // skip duplicates
            choosen.add(arr[i]);
            PowerSet(arr,i+1,Subsets,choosen);
            choosen.remove(choosen.size() - 1);
        }
    }


    public static void main(String[] args) 
    {
        //int[] nums = {3,1,2};
        int[] nums = {1,2,3,4};
        /*ArrayList<ArrayList<Integer>> Subsets = new ArrayList<>();
        ArrayList<Integer> choosen = new ArrayList<>();
        powerset(nums,0,Subsets,choosen);
        for(int i=0;i<Subsets.size();i++)
        {
            System.out.println(Subsets.get(i).toString());
        }*/

        List<List<Integer>> Subsets = new ArrayList<>();
        List<Integer> choosen = new ArrayList<>();
        Powerset(nums,0,Subsets,choosen);
        for(int i=0;i<Subsets.size();i++)
        {
            System.out.println(Subsets.get(i).toString());
        }

        /*List<List<Integer>> Subsets = new ArrayList<>();
        List<Integer> choosen = new ArrayList<>();
        PowerSet(nums,0,Subsets,choosen);
        for(int i=0;i<Subsets.size();i++)
        {
            System.out.println(Subsets.get(i).toString());
        }*/
    }
}
