package time.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TimeAwareHashMap<K, V> {

    private Map<K, HashMap<Long, V>> mainMap = new HashMap<>();

    public void put(K key, V value) {
        HashMap<Long, V> inner = !mainMap.containsKey(key) ? new HashMap<>() : mainMap.get(key);
        inner.put(System.currentTimeMillis(), value);
    }

    public V get(K key, Long time) {
        HashMap<Long, V> timeToValue = mainMap.get(key);
        if (timeToValue != null) {
            return timeToValue.get(time);
        } else {
            return null;
        }
    }
}
