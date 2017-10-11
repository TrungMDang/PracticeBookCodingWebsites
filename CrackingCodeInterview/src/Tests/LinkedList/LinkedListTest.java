package LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Trung on 10/11/2017.
 */
public class LinkedListTest {

    @Test
    public void size() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        assertEquals("Size test failed", 0, list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("Size test failed", 3, list.size());
        list.deleteEnd();
        assertEquals("Size test failed", 2, list.size());
        list.add(4);
        assertEquals("Size test failed", 3, list.size());
        list.delete(2);
        assertEquals("Size test failed", 2, list.size());


    }

    @Test
    public void add() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("Add(Integer) failed", 3, list.size());
            LinkedList<String> listS = new LinkedList<String>();
        listS.add("abc");
        listS.add("def");
        listS.add("ghi");
        assertEquals("Add(String) failed", "abc def ghi ", listS.toString());

    }

    @Test
    public void deleteEnd() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.deleteEnd();
        assertEquals("Delete end test failed", 2, list.size());

    }

    @Test
    public void delete() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.delete(1);
        assertEquals("Delete head node test failed", 2, list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.delete(3);
        assertEquals("Delete specific node test failed", 4, list.size());

    }

    @Test
    public void printList(){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals("Print list test failed", "1 2 3 ", list.toString());

    }

}