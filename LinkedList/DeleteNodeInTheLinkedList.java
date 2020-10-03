package LinkedList;

public class DeleteNodeInTheLinkedList {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.insert(5);
        ls.insert(6);
        del(ls.head.next);
        ls.display(ls.head);

    }
    public static void del(ListNode node){;

        node.val=node.next.val;
        node.next=node.next.next;

    }
}
/*
dont have access to the prev pointer or head pointer in the function
hence delaying the next value and deleting the following node.
also, constant time and space complexity
 */