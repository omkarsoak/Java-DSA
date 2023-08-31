class Outerclass
{
    int x = 10;
    class innerclass
    {
        int y = 5;
    }
}
public class OOP3 
{
    public static void main(String[] args) 
    {
        Outerclass obj = new Outerclass();
        Outerclass.innerclass obj2 = obj.new innerclass();
        System.out.println(obj.x + " " + obj2.y);
    }
}
