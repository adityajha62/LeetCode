package LinkedList;

public class ReverseLinkedListRecursive {

        public static void main(String[] args) {
            LinkedList ls = new LinkedList();
            ls.insert(2);
            ls.insert(3);
            ls.insert(4);
            ls.insert(5);
            ls.insert(6);
            ls.display(reverse(ls.head));


        }
        public static ListNode reverse(ListNode head) {
            if(head==null) return null;
            else if(head.next==null) return head;
            else{
                ListNode future =head.next;
                head.next=null;
                ListNode rest= reverse(future);
                future.next=head;
                return rest;


            }
        }



        }
