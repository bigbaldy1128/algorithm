package algorithms;

/**
 * Created by wangjinzhao on 2017/3/28.
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode cur=head;
        ListNode helper=new ListNode(0);
        ListNode pre=helper;
        ListNode next;
        while(cur!=null)
        {
            next=cur.next;
            pre=helper;
            while(pre.next!=null && pre.next.val<=cur.val)
            {
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            cur=next;
        }
        return helper.next;
    }
}
