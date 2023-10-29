package pairs;

import java.util.*;

// Given an array of n integers and given a number X, find all the
// unique pairs of elements (a,b), whose summation is equal to X.
public class PairSumsTo {

    static class Pair<T> {
        private T first;
        private T second;

        public Pair(T f, T s) {
            first = f;
            second = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?> pair = (Pair<?>) o;
            return (Objects.equals(first, pair.first) && Objects.equals(second, pair.second))
                    || (Objects.equals(first, pair.second) && Objects.equals(second, pair.first));
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static Set<Pair<Integer>> sumsTo(int[] integers, int sum) {
        Set<Pair<Integer>> results = new HashSet<>();
        for (int i = 0; i < integers.length - 1; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if ((integers[i] + integers[j]) == sum) {
                    results.add(new Pair<>(integers[i], integers[j]));
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(sumsTo(new int[] {1, 2, 4, 6, 4, 3, 2}, 5));
    }
}
