//import java.util.Arrays;
import java.util.*;

public class arrays 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[4]);
        
        //String[] arr1 = new String[3];
        //System.out.println(arr1[2]);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        for(int num : arr)
        {
            System.out.print(num);
        }

        System.out.println(Arrays.toString(arr));

        //multidimentional arrays
        int[][] arr3 = {{1,2,3},{4,5},{3,2,3,4,2}};
        System.out.println(Arrays.toString(arr3[1]));

        //input
        System.out.println("Input 2D array");

        Scanner input = new Scanner(System.in);


        int[][] arr4 = new int[3][4];
        for(int i=0;i < arr4.length;i++)
        {
            for(int j=0;j < arr4[i].length;j++)
            {
                arr4[i][j] = input.nextInt();
            }
        }

        for(int i=0;i < arr4.length;i++)
        {
            for(int j=0;j < arr4[i].length;j++)
            {
                System.out.print(arr4[i][j] + " ");;
            }
        }

        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(Arrays.toString(arr4[i]));
        }

        for(int[] a : arr4)
        {
            System.out.println(Arrays.toString(a));
        }



        input.close();
    }
}
