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
public class reverse_LL 
{
    public static Node insertFirst(Node head,int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head = nn;
            return head;
        }
        nn.next = head;
        head = nn;
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

    public static Node reverseLL(Node head)
    {
        if(head==null)
        {
            return null;
        }

        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        while(curr!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null)
                next = next.next;
        }
        head = prev;
        return head;
    }

    //Reverse Linked List II
    public static Node reverseBetween(Node head, int left, int right) 
    {
        if(left==right)
        {
            return head;
        }
        Node prev = null;
        Node curr = head;
        for(int i=0;i<left-1;i++)
        {
            prev = curr;
            curr = curr.next;
        }
        Node next = curr.next;
        Node start = prev;
        Node newEnd = curr;

        for(int i=0;curr!=null && i<right-left+1;i++)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null)
                next = next.next;
        }
        newEnd.next = curr;
        if(start!=null)
            start.next = prev;
        else
            head = prev;
        return head;
    }

    public static void main(String[] args) 
    {
        Node head = null;
        head = insertFirst(head, 5);
        head = insertFirst(head, 4);
        head = insertFirst(head, 3);
        head = insertFirst(head, 2);
        head = insertFirst(head, 1);
        display(head);
        //head = reverseLL(head);
        //display(head);
        head = reverseBetween(head, 2, 4);
        display(head);

    }
}
