class Linked_List 
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


	//Find middle of linked list
	public static Node findMiddle(Node head)
	{
		if(head==null)
		{
			return head;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	//merge 2 sorted linked lists
	public static Node merge(Node left, Node right)
	{
		Node result = null; 
		if (left == null)
			return right;
		if (right == null)
			return left;

		if (left.data <= right.data) 
		{
			result = left;
			result.next = merge(left.next, right);
		}
		else 
		{
			result = right;
			result.next = merge(left, right.next);
		}
		return result;
	}

	//Mergesort
	public static Node mergeSort(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}

		Node mid = findMiddle(head);

		Node nextToMid = mid.next;
		mid.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(nextToMid);
		Node res = merge(left, right);
		return res;
	}
}
public class MergeSort_LL
{
	public static void main(String[] args) 
	{
		Linked_List list1 = new Linked_List();
		list1.insertFirst(10);
		list1.insertFirst(20);
		list1.insertFirst(30);
		list1.insertFirst(40);

		list1.head = Linked_List.mergeSort(list1.head);
		list1.display();	
	}
}
