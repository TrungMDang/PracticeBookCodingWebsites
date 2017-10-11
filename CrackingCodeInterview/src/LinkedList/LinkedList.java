package LinkedList;

/**
 * Created by Trung on 6/27/2017.
 */
public class LinkedList<E> {

    private Node<E> head;

    private Node<E> tail;

    private int size;

    public LinkedList() {

        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(E data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        size++;
    }

    public void deleteEnd() {
        Node curr = head;
        if (head == null) return;
        while (curr.next != null && curr.next != tail) {
            curr = curr.next;
        }
        tail = curr;
        curr.next = null;
        size--;

    }

    public void delete(E data) {
        Node curr = head;
        if (head == null) return;
        if (head.data == data) {
            head = head.next;

            size--;
        } else {
            while (curr.next != null) {
                if (curr.next.data == data) {
                    curr.next = curr.next.next;
                    size--;
                    return;
                }
                curr = curr.next;
            }
        }
    }

    @Override
    public String toString() {
        Node curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.data + " ");
            curr = curr.next;
        }
        return sb.toString();
    }

    /**
     * Created by Trung on 6/27/2017.
     */
    private static class Node<E> {
        private E data;

        private Node next;

        public Node(E arg) {
            data = arg;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

}
