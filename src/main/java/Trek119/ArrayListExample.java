package Trek119;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    private List<String> list = new ArrayList<>();


    public void add(String item) {
        list.add(item);
    }


    public void remove(String item) {
        list.remove(item);
    }


    public boolean contains(String item) {
        for (int i = 0; i < list.size(); i++) { // Используем цикл for
            if (list.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }
}