public class functions 
{
    public static int[] swap(int a, int b)
    {
        int temp=a;
        a = b;
        b = temp;
        return new int[] {a,b};
    }
    public static int max(int a, int b)
    {
		if(a>b)
			return a;
		else
			return b;
    }

    static void swap2(int[] arr)
    {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args)
    {
        //int ans = max(10, 23);
        //System.out.println(ans);
        //int[] swap_ans;
        //int a=10, b=12;
        //System.out.printf("Before: %d %d",a , b);
        //swap_ans = swap(a, b);
        //a = swap_ans[0];
        //b = swap_ans[1];
        //System.out.printf("After: %d %d",a , b);
        int arr[] = {10,12};
        System.out.println(arr[0] + " " + arr[1]);
        swap2(arr);
        System.out.println(arr[0] + " " + arr[1]);
    }
}
