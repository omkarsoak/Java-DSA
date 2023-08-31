class student
{
    String name;
    int age;
    int salary;
    student(String name)
    {
        this.name = name;
        this.age = 10;
        this.salary = 1000;
    }
    void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
class child extends student
{
    int schoolfees;
    child()
    {
        super("harry");
        this.schoolfees = 50000;
    }

    @Override
    void display()
    {
        System.out.println(this.salary);
        System.out.println(this.schoolfees);
    }
}

public class OOP5 
{
    public static void main(String[] args) 
    {
        child rohan = new child();
        //System.out.println(rohan.name);
        //System.out.println(rohan.age);
        //System.out.println(rohan.salary);
        //System.out.println(rohan.schoolfees);
        rohan.display();
    }
}
