package algorithms;

import java.util.Stack;

/**
 * Created by wangjinzhao on 2017/3/27.
 * Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)
            return true;
        Stack<Integer> stack = new Stack<>();
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)
        {
            slow=slow.next;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow=slow.next;
        }
        return true;
    }

    public boolean isPalindrome2(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverse2(ListNode head) {
        ListNode cur=head;
        while(cur.next!=null)
        {
            ListNode next=cur.next;
            cur.next=next.next;
            next.next=head;
            head=next;
        }
        return head;
    }
}
