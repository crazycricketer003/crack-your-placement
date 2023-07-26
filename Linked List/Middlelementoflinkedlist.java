package Linked List;

public class Middlelementoflinkedlist {
    
    if (head == null || head.next == null) {
        return head;
    }



    ListNode slow = head;
    ListNode fast = head.next;
    while (true) {
        if (fast.next == null || fast.next.next == null) {
            return slow.next;
        }
        slow = slow.next;
        fast = fast.next.next;
    }
}

     