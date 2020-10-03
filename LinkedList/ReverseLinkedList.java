package LinkedList;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        ls.insert(6);
        ls.display(reverse(ls.head));


    }
    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev=null ;
        while(curr!=null){
            ListNode future= curr.next;
            curr.next=prev;    //not a doubly linked list cuz one next per node! which is modified
            prev=curr;
            curr=future;

        }
        head=prev;
        return head;

    }
}
/*

linear time complexity and constant space complexity!

The other approach with stack has an additional space requirement of O(n) and same time complexity.
The recursive program is saved as another!

public static ListNode reverse(ListNode head){
        ListNode temp= head;
        Stack<Integer> st= new Stack<>();
        while (temp.next!=null){
           st.push(temp.val);
           temp=temp.next;
        }
        st.push(temp.val);

        temp=head;
        while (temp.next!=null){
           temp.val=st.pop();
            temp=temp.next;
        }
       temp.val=st.pop();
        return head;


    }
 */
