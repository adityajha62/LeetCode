package LinkedList;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(3);
        ll.insert(2);
        ll.insert(8);
        ll.insert(4);
        ll.insert(5);
        ll.insert(7);
        ll.insert(24);
        ll.insert(21);
       ListNode temp = insertionSort(ll.head);

       ll.display(temp);

    }
    public static ListNode insertionSort(ListNode curr){
        ListNode i = curr.next;
        ListNode last;
        while(i!=null){
            if(i.next==null)
                last =i ;
            for(ListNode j = curr ; j!=i;j=j.next){
                if(j.val>j.next.val){
                    swap(j,j.next);
                }
            }
          i=i.next;
        }
        return curr;
    }
    public static void swap(ListNode A, ListNode B){
        int temp =A.val;
        A.val=B.val;
        B.val=temp;
    }


}
