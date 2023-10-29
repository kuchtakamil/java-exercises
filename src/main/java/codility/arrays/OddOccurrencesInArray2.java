package codility.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddOccurrencesInArray2 {
        public int solution(int[] A) {

            Set<Integer> singles = new HashSet<>();
            IntStream.of(A).forEach(i -> {
                if (singles.contains(i)) {
                   singles.remove(i);
                } else {
                    singles.add(i);
                }
            });
            return singles.stream().findFirst().orElse(0);
        }
    }