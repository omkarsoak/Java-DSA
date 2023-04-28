class DoubleLinkedList
{
    static class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data) 
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    public DoubleLinkedList()
    {
        head = null;
    }

    public void insertFirst(int data)
    {
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;  
            return;     
        }
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }

    public int deleteFirst()
    {
        if(head==null)
        {
            return -1;
        }
        head.next.prev = null;
        int data = head.next.data;
        head = head.next;
        return data;
    }



    public void display()
    {
        Node ptr = head;
        while(ptr!=null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.deleteFirst();
        list.display();
    }

}
