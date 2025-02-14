package Linked List;

public class cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
            slow = slow.next;
        }
        return false;
    }
}
}
