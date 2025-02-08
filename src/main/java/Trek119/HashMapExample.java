package Trek119;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapExample {
    private Map<Integer, String> map = new HashMap<>();


    public void add(Integer key, String value) {
        map.put(key, value);
    }


    public void remove(Integer key) {
        map.remove(key);
    }


    public String get(Integer key) {
        return map.get(key);
    }


    public boolean containsValue(String value) {
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}