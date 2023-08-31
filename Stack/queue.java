class queueLL
{
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public queueLL()
    {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {return front==null;}

    public void add(int data)
    {
        Node temp = new Node(data);
        if(isEmpty()==true)
        {
            front = temp;
            rear = temp;
        }
        rear.next = temp;
        rear = temp;
    }

    public int poll()
    {
        if(isEmpty()==true) return -1;
        int temp = front.data;
        front = front.next;
        return temp;
    }

    public void display()
    {
        Node ptr = front;
        while(ptr!=null)
        {
            System.out.printf("%d ",ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }

}
public class queue 
{
    public static void main(String[] args) 
    {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.poll());
        q.display();
        q.add(23);
        q.poll();
        q.display();
    }
}
