import java.util.LinkedList;
import java.util.Queue;

class stack
{
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public void push(int data)
    {
        q2.add(data);
        while(q1.isEmpty()!=true)
        {
            int temp = q1.poll();
            q2.add(temp);
        }

        Queue<Integer> tempQ = q1;
        q1 = q2;
        q2 = tempQ;
    }

    public int pop()
    {
        return q1.poll();
    }
}

public class stackUsingQueue 
{
    public static void main(String[] args) 
    {
        stack s = new stack();
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
