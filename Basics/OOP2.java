class human
{
    String name;  //instance variables
    int age;
    int salary;
    static int population;    //static variable

    static
    {
        population = 10;
    }

    public human(String name,int age,int salary)   //constructor
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        human.population += 1;   //increment population when a new human is created
    }

    void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }

    static int tax(int base,int percent)
    {
        int tax = base + base*percent/100;
        return tax;
    }

}
public class OOP2
{
    public static void main(String[] args)
    {
        human omkar = new human("omkar",19,100000);
        human rahul = new human("rahul",20,1000);
        System.out.println(omkar.name);   //accesing instance variables by object name
        System.out.println(rahul.age);
        System.out.println(human.population);   //accessing static variables by class name
        omkar.display();
    }
}
