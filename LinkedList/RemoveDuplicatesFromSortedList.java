package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(1);
        ls.insert(1);
        ls.insert(1);
        ls.insert(2);
        ls.insert(2);
        ListNode newHead=deleteDuplicates(ls.head);
        ls.display(newHead);


    }

    public static  ListNode deleteDuplicates(ListNode head) {
        ListNode temp= head;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val) temp.next=temp.next.next;
            else
                temp=temp.next;

        }
        return head;

    }
}
/*
linear time and constant space complexity.
 */