public class variable_arguments 
{
    static void fun(int ...a)
    {
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
    
    public static void main(String[] args) 
    {
        int a = 0;
        int b = 10;
        fun(a,b);
        
    }
}
