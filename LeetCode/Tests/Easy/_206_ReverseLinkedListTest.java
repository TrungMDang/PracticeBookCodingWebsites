package Easy;

import org.junit.Test;

import static org.junit.Assert.*;
import LinkedList.ListNode;


/**
 * Created by Trung on 10/13/2017.
 */
public class _206_ReverseLinkedListTest {
    @Test
    public void reverse() throws Exception {
        int[] data = {1, 4, -3, -9, 2, 6, 11, -39};
        int index = 1;
        ListNode head = new ListNode(data[0]);
        ListNode curr = head;
        while (index < data.length) {
            curr.setNext(new ListNode(data[index]));
            index++;
            curr = curr.getNext();
        }
        head = _206_ReverseLinkedList.reverse(head);
        assertEquals("Reverse a linked list test failed.",
                "-39 11 6 2 -9 -3 4 1 ",
                printList(head));

    }
    private String printList(ListNode list) {
        StringBuilder sb = new StringBuilder();
        ListNode curr = list;
        while (curr != null) {
            sb.append(curr.getData() + " ");
            curr = curr.getNext();
        }
        return sb.toString();
    }

}