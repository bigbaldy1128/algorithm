import algorithms.*;

/**
 * Created by wangjinzhao on 2017/3/16.
 */
public class Test {

    public static void main(String... args)
    {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        new PalindromeLinkedList().reverse2(head);
    }


}
