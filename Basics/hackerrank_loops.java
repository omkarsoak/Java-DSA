
//import java.io.*;
import java.util.*;
import java.lang.Math;
public class hackerrank_loops 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        
        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];
        for(int i=0;i<q;i++)
        {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            n[i] = input.nextInt();    
        }

        for(int i=0;i<q;i++)
        {
            System.out.println(Arrays.toString(series(a[i],b[i],n[i])));
        }
        input.close();
    }
    public static int[] series(int a,int b,int n)
    {
        int[] ans = new int[n];
        ans[0] = a + (int)(Math.pow(2,0)*b);
        for(int i=1;i<n;i++)
        {
            ans[i] = ans[i-1] + (int)(Math.pow(2,i)*b);
        }
        return ans;
    }
}

