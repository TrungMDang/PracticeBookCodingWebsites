package ArrayList;

/**
 * Created by Trung on 5/30/2017.
 */
public class ArrayList<E> {

    public static int DEFAULT_SIZE = 10;

    E[] data;

    public ArrayList() {
        data = (E[]) new Object[DEFAULT_SIZE];

    }



}
