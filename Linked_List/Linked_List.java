public class Linked_List 
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public Linked_List()
    {
        this.head = null;
    }

    public void insertFirst(int data)
    {
        Node new_Node = new Node(data);

        if(head==null)
        {
            head = new_Node;
            return;
        }

        new_Node.next = head;
        head = new_Node;
    }

    public void insertLast(int data)
    {
        Node new_Node = new Node(data);
        if(head==null)    //empty list condition
        {
            head = new_Node;
            return;
        }
        Node ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = new_Node;
    }

    public void insertAtIndex(int index,int data)
    {
        Node new_Node = new Node(data);
        Node p = head;
        for(int i=0;i<index-1;i++)
        {
            p = p.next;
        }
        new_Node.next = p.next;
        p.next = new_Node;
    }

    //insert at index recursive
    public void InsertAtIndex(int index,int data)
    {
        insertHelper(index,data,head);
    }

    private void insertHelper(int index,int data,Node p)
    {
        if(index==1)
        {
            Node temp = new Node(data);
            temp.next = p.next;
            p.next = temp;
            return;
        }
        insertHelper(index-1, data, p.next);
    }

    public int deleteFirst()
    {
        int data = head.data;
        head = head.next;
        return data;
    }

    public int deleteLast()
    {
        Node p = head;
        while(p.next.next!=null)
        {
            p = p.next;
        }
        int data = p.next.data;
        p.next = null;
        return data;

    }

    public void display()     //class method display
    {
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.print("\n");
    }

    public static void display(Node head)   //static method display
    {
        Node p = head;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.print("\n");
    }

    //delete duplicates from sorted list
    public void DeleteDuplicates()
    {
        Node p = head;
        while (p.next!=null) 
        {
            if(p.next.data==p.data)
            {
                p.next = p.next.next;
            }  
            else
            {
                p = p.next;  
            }
        }
    }


    public static Node mergeSortedLL(Node list1,Node list2)
    {
        Node p1 = list1;
        Node p2 = list2;
        Linked_List ans = new Linked_List();

        while(p1!=null && p2!=null)
        {
            if(p1.data<=p2.data)
            {
                ans.insertLast(p1.data);
                p1 = p1.next;
            }
            else if(p2.data<p1.data)
            {
                ans.insertLast(p2.data);
                p2 = p2.next;
            }
        }
        while(p1!=null)
        {
            ans.insertLast(p1.data);
            p1 = p1.next;
        }

        while(p2!=null)
        {
            ans.insertLast(p2.data);
            p2 = p2.next;
        }
        return ans.head;
    }

    public static Node merge(Node left,Node right)
    {
        Node res = null;

        if(left == null)
            return right;
        
        if(right == null)
            return left;

        if (left.data <= right.data)
        {
            res = left;
            res.next = merge(left.next, right);
        }
        else 
        {
            res = right;
            res.next = merge(left, right.next);
        }
        return res;
    }


    public static void main(String[] args) 
    {
        Linked_List list1 = new Linked_List();
        list1.insertFirst(40);
        list1.insertFirst(30);
        list1.insertFirst(20);
        list1.insertFirst(10);

        Linked_List list2 = new Linked_List();
        list2.insertFirst(80);
        list2.insertFirst(30);
        list2.insertFirst(25);
        list2.insertFirst(11);

        list1.display();
        list2.display();

        Node ans1 = mergeSortedLL(list1.head, list2.head);
        display(ans1);

        Node ans2 = merge(list1.head, list2.head);
        display(ans2);
        
    }
}
