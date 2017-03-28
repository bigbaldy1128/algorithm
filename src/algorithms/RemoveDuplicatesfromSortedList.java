package algorithms;

/**
 * Created by wangjinzhao on 2017/3/28.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode cur=head.next;
        ListNode last=head;
        while(cur!=null)
        {
            if(cur.val==last.val)
            {
                last.next=cur.next;
            }
            else
            {
                last=cur;
            }
            cur=cur.next;
        }
        return head;
    }
}
