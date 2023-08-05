package Linked List;

public class Addtwonumbers {
    
    
    ListNode temp = new ListNode();
    ListNode head = temp;
    int carry = 0;
    while(list1!=null || list2!=null || carry==1){
        int add=0;
        if(list1!= null) {
            add+=list1.val;
            list1=list1.next;
        }
        if(list2!= null) {
            add+=list2.val;
            list2=list2.next;
        }
        add+=carry;
        carry = add / 10; 
        ListNode node = new ListNode(add % 10); 
        head.next = node; 
        head = head.next; 
    }

    return temp.next;

    
}
