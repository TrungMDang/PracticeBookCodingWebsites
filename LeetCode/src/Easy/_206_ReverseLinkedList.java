package Easy;

import LinkedList.ListNode;

import java.util.Stack;

/**
 * Created by Trung on 10/13/2017.
 */
public class _206_ReverseLinkedList {

    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode newHead = new ListNode(0);
        ListNode lastPos = null;
        while (curr != null) {
            ListNode node = new ListNode(curr.getData());
            if (lastPos != null) {
                node.setNext(lastPos);
                newHead.setNext(node);
            } else {
                lastPos = node;
                newHead.setNext(node);
            }
            curr = curr.getNext();


        }
        return null;
    }
}
