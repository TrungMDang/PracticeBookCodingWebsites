package TreeNode;

/**
 * Created by Trung on 6/5/2017.
 */
public class ListNode<E> {

    private E data;

    private E next;

    private E prev;

    public ListNode() {
        data = (E) new Object();
        next = null;
        prev = null;
    }

    public ListNode(E theData) {
        data = theData;
        next = null;
        prev = null;
    }

    @Override
    public String toString() {
        return data.toString() + " -> ";
    }

}
