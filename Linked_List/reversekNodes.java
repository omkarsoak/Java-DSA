class ListNode 
{
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
 
public class reversekNodes 
{
    public static ListNode reverseKGroup(ListNode head, int k) 
    {
        if(k<= 1 || head==null || head.next==null)
        {
            return head;
        }
        
        int count = 1;
        ListNode p = head;
        while(p.next!=null)
        {
            p = p.next;
            count++;
        }

        int run_time = count/k;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode start = null;

        while(run_time > 0 && curr!=null)
        {
            ListNode last = start;
            start = curr;
            prev = null;
            for(int i=0;i<k && curr!=null;i++)
            {
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next!=null)
                {
                    next = next.next;
                }
            }
            start.next = curr;
            
            if(last!=null)
            {
                last.next = prev;
            }
            else
            {
                head = prev;
            }
            run_time--;
        }
        return head;
    }

    public static void display(ListNode head)
    {
        ListNode p = head;
        while(p!=null)
        {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.print("\n");
    }

    public static ListNode insertLast(ListNode head,int data)
    {
        ListNode new_Node = new ListNode(data);
        if(head==null)    //empty list condition
        {
            head = new_Node;
            return head;
        }
        ListNode ptr = head;
        while(ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = new_Node;
        return head;
    }

    public static void main(String[] args) 
    {
        ListNode head = null;
        head = insertLast(head, 1);
        head = insertLast(head, 2);
        head = insertLast(head, 3);
        head = insertLast(head, 4);
        head = insertLast(head, 5);
        display(head);

        head = reverseKGroup(head, 2);
        display(head);
    }
}
