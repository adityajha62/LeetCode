package LinkedList;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        //ls.insert(6);
        int data = midfind(ls.head).val;
        System.out.println(data + " is");


    }

    public static ListNode midfind(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

/*
does it it in linear time with constant space complexity.
Other approaches could be traverse linearly and be storing in an array and return middle index.
That would be linear time and space complexity.
The direct intuition to calculate the length of the linkedlist and then traverse half way is also a linear
approach.
 */