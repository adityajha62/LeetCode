package LinkedList;

public class MergeTwoLinkedListII {
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
        if(l1==null) return l2;
        else if(l2==null) return l1;
        else{
            if(l1.val<l2.val){
                l1.next=mergeTwoLists(l1.next,l2);
                return l1;
            }
            else{
                l2.next=mergeTwoLists(l1,l2.next);
                return l2;
            }
        }

    }
}
//recursive apporach
