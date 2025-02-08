package Trek119;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    private List<String> list = new LinkedList<>();


    public void add(String item) {
        list.add(item);
    }


    public void remove(String item) {
        list.remove(item);
    }


    public boolean contains(String item) {
        if (list.isEmpty()) {
            return false;
        }
        ListIterator<String> iterator = list.listIterator();
        do {
            if (iterator.next().equals(item)) {
                return true;
            }
        } while (iterator.hasNext());
        return false;
    }
}