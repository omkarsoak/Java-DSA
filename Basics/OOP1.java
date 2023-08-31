class student
{
    int roll_no;
    String name;
    float marks;
    student(int rollno,String name, int marks)
    {
        this.roll_no = 10;
        this.name = name;
        this.marks = marks;
    }

    student(int roll_no)
    {
        this.roll_no = 112103099;
        this.name = "gaurav";
    }

    student(int marks, String name1)
    {
        this.marks = marks;
        this.name = name1;
    }
}

public class OOP1 
{
    public static void main(String[] args) 
    {
        student s1 = new student(12,"gaurav",13);
        System.out.println(s1.roll_no);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        student s2 = new student(12,"gaurav");
        System.out.println(s2.roll_no);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        student s3 = new student(109341);
        System.out.println(s3.roll_no);
        System.out.println(s3.name);
        System.out.println(s3.marks);
    }
}
