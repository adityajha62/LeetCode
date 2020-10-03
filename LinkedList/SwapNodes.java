package LinkedList;

public class SwapNodes {

    public static void main(String[] args) {

        LinkedList l1= new LinkedList();
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.insert(8);
        l1.insert(9);

        l1.display(swapper(l1.head));



    }
    public static ListNode swapper(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode curr= head;
        while(curr!=null && curr.next!=null ){

            ListNode fut=curr.next;
            ListNode fut_fut=curr.next.next;

            fut.next=curr;
            curr.next=fut_fut;
            prev.next=fut;

            prev=curr;
            curr=fut_fut;


        }
        return dummy.next;
    }
}
