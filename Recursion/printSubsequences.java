import java.util.ArrayList;

public class printSubsequences 
{
    static void print(int[] arr, int i, ArrayList<Integer> choosen)
    {
        if(i>=arr.length)
        {
            System.out.println(choosen.toString());
            return;
        }
        choosen.add(arr[i]);
        print(arr, i+1, choosen);
        choosen.remove(choosen.size()-1);
        print(arr, i+1, choosen);
    }
    public static void main(String[] args) 
    {
        int[] arr = {3,1,2};
        ArrayList<Integer> choosen = new ArrayList<Integer>();
        print(arr,0,choosen);
        
    }
}
