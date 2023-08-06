package maps;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

//        TreeMap<Integer, String> map = new TreeMap<>();
//        map.put(3, "val");
//        map.put(2, "val");
//        map.put(1, "val");
//        map.put(5, "val");
//        map.put(4, "val");
//
//        System.out.println(map.keySet().toString());

        ////////////////////////

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, null);
        map.put(2, null);
        map.put(3, null);
        map.put(4, null);
        map.put(5, null);

        Set<Integer> keys = map.keySet();
        Integer[] arr = keys.toArray(new Integer[keys.size()]);
        System.out.println("arr = " + arr.length);

        System.out.println(new Integer[3]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
