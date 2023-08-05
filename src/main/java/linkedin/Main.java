package linkedin;

import java.util.*;
class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
//        List<String> list25 = new ArrayList<>(Arrays.asList(array));
        System.out.println(list2);
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.println(list3);
        System.out.print(list1.equals(list2));
        System.out.print(list1.equals(list3));
        Arrays.asList("Hello", "World");



    }
}