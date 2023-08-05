package Linked List;

public class LinkedListCycle2 {
    HashSet<ListNode> hs=new HashSet<>();

    while(head!=null){
        if(hs.contains(head))
            return head;
        hs.add(head);
        head=head.next;
    }
    return null;
}
