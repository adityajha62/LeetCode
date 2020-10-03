package LinkedList;

public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
        val=x;
    }
    }
class LinkedList {
    ListNode head;

    public void insert(int data) {
        ListNode node = new ListNode(data);
        if (head == null)
            head = node;
        else {
            ListNode temp = head;

            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }


    }
    public void display(ListNode node){
        ListNode temp = node;
        while(temp.next!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.insert(2);
        ls.insert(31);
        ls.insert(48);
        ls.insert(64);



        ls.display(ls.head);
    }
}


