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
public class OOP6
{
    public static void main(String[] args) 
    {
        Object obj = new Object();
        System.out.println(obj.getClass());
        student omkar = new student("omkar");
        System.out.println(omkar.getClass());
        System.out.println(omkar.hashCode());

        System.out.println(omkar instanceof student);

    }
}
