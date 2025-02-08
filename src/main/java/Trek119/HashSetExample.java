package Trek119;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    private Set<String> set = new HashSet<>();


    public void add(String item) {
        set.add(item);
    }


    public void remove(String item) {
        set.remove(item);
    }


    public boolean contains(String item) {
        for (String element : set) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }
}