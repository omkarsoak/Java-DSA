class student
    {
        String name;
        student(String name)
        {
            this.name = name;
        }
    }
public class OOP4 
{
    public static void main(String[] args) 
    {
        student omkar = new student("Omkar");
        student rahul = new student("Rahul");
        System.out.println(omkar.name);
        System.out.println(rahul.name);

        System.out.println();
    }

    
}
