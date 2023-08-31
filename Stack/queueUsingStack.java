import java.util.Stack;
//dequeue costly
class queue
{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data)
    {
        s1.push(data);
    }

    public int dequeue()
    {
        if(s2.isEmpty())
        {
            while(s1.isEmpty()!=true)
            {
                int temp = s1.pop();
                s2.push(temp);
            }
        }
        return s2.pop();
    }

}
public class queueUsingStack 
{
    public static void main(String[] args) 
    {
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(23);
        System.out.println(q.dequeue());
    }
}
