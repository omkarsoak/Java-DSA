class Node
{
    int data;
    Node next;
    public Node(int data) 
    {
        this.data = data;
        this.next = null;
    }
}
public class Main
{
    public static Node insertFirst(Node head, int data)
    {
        Node new_Node = new Node(data);
        if(head==null)
        {
            head = new_Node;
            return head;
        }
        new_Node.next = head;
        head = new_Node;
        return head;
    }
    
    public static Node insertLast(Node head,int data)
    {
        Node new_Node = new Node(data);
        if(head==null)    //empty list condition
        {
            head = new_Node;
            return head;
        }
        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = new_Node;
        return head;
    }

    public static Node insertAtIndex(Node head,int index,int data)
    {
        Node new_Node = new Node(data);
        Node p = head;
        for(int i=0;i<index-1;i++)
        {
            p = p.next;
        }
        new_Node.next = p.next;
        p.next = new_Node;
        return head;
    }

    public static Node deleteFirst(Node head)
    {
        head = head.next;
        return head;
    }

    public static Node deleteLast(Node head)
    {
        Node p = head;
        while(p.next.next!=null)
        {
            p = p.next;
        }
        p.next = null;
        return head;
    }

    public static void display(Node head)
    {
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.print("\n");
    }


    public static void main(String[] args) 
    {
        Node head = null;
        head = insertFirst(head, 10);
        head = insertFirst(head, 20);
        head = insertFirst(head, 30);
        head = insertFirst(head, 40);
        head = insertLast(head, 13);
        head = insertAtIndex(head, 2, 12);
        head = deleteFirst(head);
        display(head);
    }
}
