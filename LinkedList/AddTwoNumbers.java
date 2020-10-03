package LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {

        LinkedList l1= new LinkedList();
        l1.insert(9);
        l1.insert(9);
        //l1.insert(4);

        LinkedList l2= new LinkedList();
        l2.insert(1);
        //l2.insert(3);
        //l2.insert(4);



        l1.display(adder(l1.head,l2.head));



    }
    public static ListNode adder(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int carry=0;
        while(head1!=null || head2!=null){
                int l = head1==null ? 0 : head1.val;
                int r = head2==null ? 0 :head2.val;
            int data=l+r+carry;
            if(data<10){
                p.next=new ListNode(data);
                carry=0;
            }
            else{
                p.next=new ListNode(data%10);
                carry=1;
            }
            p=p.next;
           if(head1!=null) head1=head1.next;
           if(head2!=null) head2=head2.next;
        }
        if (carry==1)
            p.next=new ListNode(1);

        return dummy.next;

    }
}
