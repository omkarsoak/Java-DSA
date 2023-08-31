class StackLL   //stack using linked list
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
    
    Node top;   //main top pointer

    public StackLL(){this.top = null;}
    
    public boolean isEmpty() {return top==null;}

    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }
    public int pop()
    {
        if(isEmpty()==true) return -1;
        int temp = top.data;
        top = top.next;
        return temp;
    }
    public int peek()
    {
        if(isEmpty()==true) return -1;
        return top.data;
    }
    public void display()
    {
        Node ptr = top;
        while(ptr!=null)
        {
            System.out.printf("%d ",ptr.data);
            ptr=ptr.next;
        }
        System.out.println();
    }
}
public class stack
{
    public static void main(String[] args) 
    {
        StackLL s1 = new StackLL();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.display();
        System.out.println(s1.pop());
        s1.display();
        s1.push(6);
        s1.display();
        System.out.println(s1.pop());
        System.out.println(s1.peek());
        s1.display();
    }
}