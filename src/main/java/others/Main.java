package others;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        int x = 5___0;
//        int y = ___6;
//        int z = 4___;
        float f = 13.33_45f;
        double d = 2_4____5_5;

//        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);
        short y = 6;
        long z = 7;
        go(y);
        go(z);

        SortedSet<Object> s = new TreeSet<>();
        s.add("a");
        s.add("b");
        s.add("m");
        s.add("c");
//        s.add(1);
//        s.add(1L);
        final SortedSet<Object> b = s.tailSet("b");
        System.out.println(b);
//        s.add(Integer.valueOf(1));

        Set<Object> s2 = new HashSet<>();
        s2.add("toptal");
        s2.add(1);
        s2.add(2L);
        System.out.println(s2);
    }
    public static void go(Long n){
        System.out.println("Long");
    }

    public static void go(Short n){
        System.out.println("Sh");
    }

    public static void go(int n){
        System.out.println("int");
    }
}
