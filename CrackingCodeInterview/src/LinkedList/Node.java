package LinkedList;

/**
 * Created by Trung on 6/27/2017.
 */
public class Node<E> {
    private E data;

    private  Node next;

    private Node prev;

    public Node(E arg) {
        data = arg;
    }

    public Node next() {
        return next;
    }

    public Node prev() {
        return prev;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
