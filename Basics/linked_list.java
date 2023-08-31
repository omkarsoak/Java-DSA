import java.util.*;
public class linked_list
{
    public static void main(String[] args) 
    {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.addFirst(20);
        list.add(30);
        list.add(2,40);
        System.out.println(list);

        System.out.println(list.getLast());
    }
}