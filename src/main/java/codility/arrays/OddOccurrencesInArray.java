package codility.arrays;

import java.util.*;
import java.util.stream.Collectors;

//  Damaged
    public class OddOccurrencesInArray {
        public int solution(int[] A) {

            Map<Integer, Long> integerToCount = Arrays.stream(A)
                    .boxed()
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

            return integerToCount.entrySet().stream().filter(e -> e.getValue() == 1).findFirst()
                    .map(en -> en.getKey()).orElse(0);
        }
    }