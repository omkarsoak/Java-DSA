abstract class student
{
    String name;
    int age;
    public student(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    int salary;
    student(String name)
    {
        this.name = name;
        this.age = 10;
        this.salary = 1000;
    }
    abstract void display();
    void normal()
    {
            System.out.println("This is a normal method");
    }
}

class child extends student
{
    child(String name)
    {
        super(name);
    }
    void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOP7 {
    public static void main(String[] args) {
        child omkar = new child("omkar");
        omkar.display();

    }
}
