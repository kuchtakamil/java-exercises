package devskill3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;
import java.util.function.Supplier;
import java.util.stream.IntStream;


public class Main {
    final static A a11 = new A();
    public static void main(String[] args) throws FileNotFoundException {
        transform(HashSet::new);
        transform(HashSet<String>::new);

        final Optional<Integer> integer = Optional.ofNullable(2);
        Optional.of(3);
    A a1 = new A();
    A a2 = new A();

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

//        try (Scanner scanner = new Scanner(new File("testRead.txt"));
//             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
//            a2 = null;
//            System.out.println(a11);
//            while (scanner.hasNext()) {
//                writer.print(scanner.nextLine());
//            }
//        }

        int j = 5;
        inc(j);
        inc(j);
        inc(j);
        System.out.println("j = " + j);

        List l = new ArrayList();
        l.add(Integer.valueOf(13));
        System.out.println(l);
        modif(l);
        System.out.println(l);
        del(l);
        System.out.println(l);
        replace(l);
        System.out.println(l);
        l = null;
        System.out.println(l);

        System.out.println(workaroundSingleThread());
    }

//    https://www.baeldung.com/java-lambda-effectively-final-local-variables
//    its class member so is kept on heap, not stack, so new thread has access to it
    private int start = 0;

    Supplier<Integer> incrementer() {
//        return () -> start;
        return () -> start++;
    }
    static void transform(Supplier<Set<String>> strings){

    }

    static void inc(int i){
        i++;
        System.out.println("i = " + i);
    }

    static void modif(List o) {
        o.add(66);
    }

    static void del(List o) {
        o = null;
    }

    static void replace(List o) {
        List l = new ArrayList();
        l.add(100);
        o = l;
    }

    public static int workaroundSingleThread() {
        int[] holder = new int[] { 2 };
        IntStream sums = IntStream
                .of(1, 2, 3)
                .map(val -> val + holder[0]);

        holder[0] = 0;
        return sums.sum();
    }

}
class A {}
