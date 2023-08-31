import java.util.*;
public class Example
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        int number = 10;
        System.out.println(number);
        System.out.println("sometheinf soifnv");
        System.out.print("newline");
        double num = 0;
        num = 10;
        System.out.println(num);
        String name = "omkar";
        System.out.println(name);
        
        Scanner input = new Scanner(System.in);
        /*int num1 = input.nextInt();
        System.out.println(num1);

        String name1 = input.nextLine();
        System.out.println(name1);*/

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered = " + myFloat);
    	
        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered = " + myDouble);
    	
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.nextLine();
        System.out.println("Text entered = " + myString);

        input.close();
        

    }
}
//Main 
