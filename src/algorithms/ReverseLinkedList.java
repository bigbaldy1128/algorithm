package algorithms;

/**
 * Created by wangjinzhao on 2017/3/28.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        while(cur!=null && cur.next!=null)
        {
            ListNode next=cur.next;
            cur.next=next.next;
            next.next=head;
            head=next;
        }
        return head;
    }
}
