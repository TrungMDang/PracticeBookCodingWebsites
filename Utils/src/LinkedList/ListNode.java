package LinkedList;

/**
 * Created by Trung on 10/13/2017.
 */
public class ListNode {

    private int data;

    public ListNode(int n){
        data = n;
    }
    private ListNode next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}
