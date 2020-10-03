package LinkedList;

public class MergeTwoSortedLinkedList {
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
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l2.val<l1.val){
            ListNode temp=l1;
            l1=l2;
            l2=temp;
        }
        ListNode head=l1;
        l1=l1.next;
        ListNode curr= head;

        while(l1!=null&&l2!=null){
            if(l2.val<l1.val){
                ListNode oldval=l2;
                l2=l2.next;
                curr.next=oldval;
                oldval.next=l1;
                curr=oldval;
            }
            else{
                curr=l1;
            l1=l1.next;}

        }
        if(l1==null){
            curr.next=l2;
        }



 return head;
    }
}
/*iterative solution is always preferred to recursive as it saves space complexity due to recursive stack!

Linear solution to the problem, constant stack;

 */


