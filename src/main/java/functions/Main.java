package functions;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
        System.out.println(f.apply(3,4));
        BiFunction<String, String, String> f2 = (x, y) -> x + y;
        System.out.println(f2.apply("s22","3434"));
    }
}
