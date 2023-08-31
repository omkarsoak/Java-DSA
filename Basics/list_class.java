import java.util.*;

public class list_class {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        Integer[] arr = new Integer[list1.size()];
        list1.toArray(arr);
        System.out.println(list1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
}
