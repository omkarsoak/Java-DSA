import java.util.LinkedList;
import java.util.Queue;

class stack1
{
    static Queue<Integer> q = new LinkedList<>();

    public void push(int data)
    {
        q.add(data);
        int size = q.size()-1;
        for(int i=0;i<size;i++)
        {
            int temp = q.poll();
            q.add(temp);
        }
    }
    public int pop()
    {
        return q.poll();
    }
}
public class stackUsingSingleQueue 
{
    public static void main(String[] args) 
    {
        stack1 s = new stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        s.push(12);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}