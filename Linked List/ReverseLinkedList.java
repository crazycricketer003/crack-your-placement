package Linked List;

public class ReverseLinkedList {
    ListNode d=null;

    while(head!=null){
        ListNode next=head.next;
        head.next=d;
        d=head;
        head=next;
    }
    return d;
}
