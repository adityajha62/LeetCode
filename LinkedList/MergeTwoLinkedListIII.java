package LinkedList;

//dummy  node approach
public class MergeTwoLinkedListIII {
    public static void main(String[] args) {
        LinkedList ls1 = new LinkedList();
        LinkedList ls2 = new LinkedList();
        ls1.insert(2);
        ls1.insert(4);
        ls1.insert(6);
        ls1.insert(7);
        ls1.insert(10);
        ls1.insert(12);

        ls2.insert(1);
        ls2.insert(3);
        ls2.insert(5);
        ls2.insert(8);
        ls2.insert(9);
        ls2.insert(13);
        ListNode fin =mergeTwoLists(ls1.head,ls2.head);
        ls2.display(fin);
}
public static ListNode mergeTwoLists(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode p =dummy;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                p.next=head1;
                head1=head1.next;
            }
            else{
                p.next=head2;
                head2=head2.next;
            }
            p=p.next;
        }
        if(head1==null){
           p.next=head2;
        }
        if(head2==null){
            p.next=head1;
        }

return dummy.next;
}
}
